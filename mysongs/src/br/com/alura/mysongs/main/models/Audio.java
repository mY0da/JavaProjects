package br.com.alura.mysongs.main.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private int classification;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return this.totalReproductions;
    }

    public int getTotalLikes() {
        return this.totalLikes;
    }

    public int getClassification() {
        return this.classification;
    }

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalReproductions++;
    }
}
