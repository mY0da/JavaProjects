package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.YearOfReleaseConversionException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) //Record variable are in lower case
                .setPrettyPrinting() //Easier to read
                .create();

        while (!search.equalsIgnoreCase("exit")) {
            System.out.println("Write a movie to search: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")){
                break;
            }

            var encodedSearch = URLEncoder.encode(search, "UTF-8").replace("+", "%20");
            String key = System.getenv("MY_API_KEY");
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(String.format("https://www.omdbapi.com/?t=%s&apikey=%s", encodedSearch, key)))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Converted to Title:");
                System.out.println(myTitle);

                titles.add(myTitle);
                //FileWriter writer = new FileWriter("movies.txt");
                //writer.write(myTitle.toString());
                //writer.close();
            } catch (NumberFormatException e) {
                System.out.println("Error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Search error, verify URI");
            } catch (YearOfReleaseConversionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);

        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("Ended!");
    }
}
