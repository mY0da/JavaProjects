package br.com.alura.mysongs.main.models;

public class MyFavoriteOnes {

    public void include(Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " is considered absolut success and everyone's favorite!");
        } else {
            System.out.println(audio.getTitle() + " is really groovy and everyone enjoys it.");
        }
    }
}
