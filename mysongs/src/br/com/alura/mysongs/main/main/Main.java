package br.com.alura.mysongs.main.main;

import br.com.alura.mysongs.main.models.MyFavoriteOnes;
import br.com.alura.mysongs.main.models.Podcast;
import br.com.alura.mysongs.main.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Forever");
        mySong.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            mySong.play();
        }

        for (int i = 0; i < 50; i++) {
            mySong.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavoriteOnes favorites = new MyFavoriteOnes();
        favorites.include(myPodcast);
        favorites.include(mySong);
    }
}