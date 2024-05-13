package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.YearOfReleaseConversionException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a movie to search: ");
        var search = scanner.nextLine();
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

            //Record variable are in lower case
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
            System.out.println(myTitleOmdb);

            Title myTitle = new Title(myTitleOmdb);
            System.out.println("Converted to Title:");
            System.out.println(myTitle);
        } catch (NumberFormatException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Search error, verify URI");
        } catch (YearOfReleaseConversionException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ended!");
        }
    }
}
