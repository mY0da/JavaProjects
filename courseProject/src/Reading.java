import java.util.Scanner;
public class Reading {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Your favorite movie:");
        String movie = read.nextLine();

        System.out.println("Year of release:");
        int yearOfRelease = read.nextInt();

        System.out.println("Your rating:");
        double rating = read.nextDouble();

        System.out.println(movie + " was released in " + yearOfRelease + " with rating of " + rating);
    }
}
