package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("The Godfather", 1970);
        myMovie.rating(9);
        Movie anotherMovie = new Movie("Avatar", 2023);
        anotherMovie.rating(6);
        Movie gusMovie = new Movie("Dogville", 2003);
        gusMovie.rating(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Title> list = new ArrayList<>();
        Collections.addAll(list, gusMovie, myMovie, anotherMovie, lost);
        for (Title item : list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classification: " + movie.getClassification());
            }
        }

        ArrayList<String> searchForArtist = new ArrayList<>();
        Collections.addAll(searchForArtist, "Adam Sandler", "Robert De Niro", "Jack Nicholson");
        Collections.sort(searchForArtist);
        System.out.println(searchForArtist + "\n");

        System.out.println("Unordered list:");
        System.out.println(list + "\n");

        System.out.println("Ordered list:");
        Collections.sort(list);
        System.out.println(list + "\n");

        System.out.println("Ordered list by year of release:");
        list.sort(Comparator.comparing(Title::getYearOfRelease));
        System.out.println(list);
    }
}
