package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void include(Movie m) {
//        totalTime += m.getDurationInMin();
//    }

//    public void include(Serie s) {
//        totalTime += s.getDurationInMin();
//    }

    public void include(Title t) {
        this.totalTime += t.getDurationInMin();
    }
}
