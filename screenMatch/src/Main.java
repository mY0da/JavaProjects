import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setYearOfRelease(1970);
        myMovie.setDurationInMin(180);
        myMovie.setIncludeInBundle(true);

        myMovie.technicalSheet();
        myMovie.rating(8);
        myMovie.rating(6);
        myMovie.rating(10);

        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.averageRating());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setYearOfRelease(2000);
        lost.technicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinPerEpisode(50);
        System.out.println("Time to binge-watch Lost: " + lost.getDurationInMin());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());
    }
}
