package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.RecomendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("The Godfather", 1970);
        myMovie.setDurationInMin(180);
        myMovie.setIncludeInBundle(true);

        myMovie.technicalSheet();
        myMovie.rating(8);
        myMovie.rating(6);
        myMovie.rating(9);

        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.averageRating());

        Serie lost = new Serie("Lost", 2000);
        lost.technicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinPerEpisode(50);
        System.out.println("Time to binge-watch Lost: " + lost.getDurationInMin());

        Movie anotherMovie = new Movie("Avatar", 2023);
        anotherMovie.setDurationInMin(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filter.filter(episode);

        Movie gusMovie = new Movie("Dogville", 2003);
        gusMovie.setDurationInMin(200);
        gusMovie.rating(10);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(gusMovie);
        moviesList.add(myMovie);
        moviesList.add(anotherMovie);
        System.out.println("Size of the list: " + moviesList.size());
        System.out.println("First movie: " + moviesList.get(0).getName());
        System.out.println(moviesList);
    }
}
