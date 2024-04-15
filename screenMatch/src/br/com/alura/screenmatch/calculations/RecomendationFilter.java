package br.com.alura.screenmatch.calculations;

public class RecomendationFilter {

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("It is among the popular titles.");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Good rating at the moment!");
        } else {
            System.out.println("Add it to your list to watch it later.");
        }
    }
}
