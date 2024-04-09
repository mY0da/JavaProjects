import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double average = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Your rating:");
            rating = read.nextDouble();
            average += rating;
        }

        System.out.println("Average rating: " + average/3);
    }
}
