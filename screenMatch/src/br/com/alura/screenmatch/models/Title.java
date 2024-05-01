package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int yearOfRelease;
    private boolean includeInBundle;
    private double rateSum;
    private int totalRating;
    private int durationInMin;

    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return this.name;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public boolean isIncludeInBundle() {
        return this.includeInBundle;
    }

    public int getDurationInMin() {
        return this.durationInMin;
    }

    public int getTotalRating() {
        // new DecimalFormat("#.00").format(totalRating)
        return this.totalRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncludeInBundle(boolean includeInBundle) {
        this.includeInBundle = includeInBundle;
    }

    public void setDurationInMin(int durationInMin) {
        this.durationInMin = durationInMin;
    }

    public void technicalSheet() {
        System.out.println("Name of the movie: " + name);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Duration in minutes: " + durationInMin);
        System.out.println("Include in bundle: " + includeInBundle);
    }

    public void rating(double grade) {
        rateSum += grade;
        totalRating++;
    }

    public double averageRating() {
        return rateSum / totalRating;
    }
}
