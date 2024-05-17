package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.converters.CheckTitle;
import br.com.alura.screenmatch.converters.FileGenerator;
import br.com.alura.screenmatch.models.Title;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String search = "";
        ArrayList<Title> titles = new ArrayList<>();
        CheckTitle checkTitle = new CheckTitle();
        FileGenerator generator = new FileGenerator();

        while (!search.equalsIgnoreCase("exit")) {
            System.out.println("Write a movie to search: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")){
                break;
            }

            try {
                Title myTitle = checkTitle.searchTitle(search);
                System.out.println(myTitle);
                titles.add(myTitle);
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Ending the application");
            }
        }
        System.out.println(titles);
        generator.archiveJson(titles);
        System.out.println("Ended!");
    }
}
