public class Song {
    String title;
    String artist;
    int yearOfRelease;
    double rating;
    int numRating;

    void technicalSheet() {
        System.out.println("Song title: " + title);
        System.out.println("Song artist: " + artist);
        System.out.println("Song release: " + yearOfRelease);
    }

    void evaluation(double grade) {
        rating += grade;
        numRating++;
    }

    double averageRating() { return rating / numRating; }
}
