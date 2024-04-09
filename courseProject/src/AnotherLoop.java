import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double average = 0;
        double rating = 0;
        int c = 0;

        while (rating != -1) {
            System.out.println("Your rating or -1 to exit:");
            rating = read.nextDouble();

            if (rating != -1) {
                average += rating;
                c++;
            }
        }

        System.out.println("Average rating: " + (average/c > 0 ? average/c : 0));
    }
}
