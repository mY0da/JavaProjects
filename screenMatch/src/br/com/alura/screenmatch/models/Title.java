package br.com.alura.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int yearOfRelease;
    private boolean includeInBundle;
    private double rateSum;
    private int totalRating;
    private int durationInMin;

    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        //parseInt and valueOf are doing the same job
        this.yearOfRelease = Integer.parseInt(myTitleOmdb.year());
        this.durationInMin = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
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

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }

    @Override
    public String toString() {
        return "name: " + name + '\n' + "yearOfRelease: " + yearOfRelease + "\n" + "durationInMin: " + durationInMin;
    }
}
