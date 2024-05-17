package br.com.alura.screenmatch.converters;

import br.com.alura.screenmatch.exception.YearOfReleaseConversionException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckTitle {
    public Title searchTitle(String title) throws IOException, InterruptedException {
        var encodedSearch = URLEncoder.encode(title, "UTF-8").replace("+", "%20");
        String key = System.getenv("MY_API_KEY");
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) //Record variable are in lower case
                .create();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format("https://www.omdbapi.com/?t=%s&apikey=%s", encodedSearch, key)))
                    .build();

            try{
                HttpResponse<String> response = HttpClient
                        .newHttpClient()
                        .send(request, HttpResponse.BodyHandlers.ofString());
                TitleOmdb myTitleOmdb = gson.fromJson(response.body(), TitleOmdb.class);
                return new Title(myTitleOmdb);
            } catch (NumberFormatException | YearOfReleaseConversionException e) {
                System.out.println("Error: ");
                System.out.println(e.getMessage());
                return null;
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("Search error, verify URI");
            } catch (Exception e) {
                throw new RuntimeException("Movie with this title could not found.");
            }
    }
}