package br.com.alura.screenmatch.converters;

import br.com.alura.screenmatch.models.Title;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileGenerator {
    public void archiveJson(ArrayList<Title> titles) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titles));
        writer.close();
    }
}
