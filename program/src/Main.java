import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int random = new Random().nextInt(100);
        Scanner read = new Scanner(System.in);
        int answer;
        int c = 0;

        System.out.println("Guess the number!");
        while (c < 5) {
            answer = read.nextInt();
            c++;

            if (answer > random) {
                System.out.println("Too high!");
            } else if (answer < random) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congrats, you got it!");
                break;
            }
        }

        if (c == 5) {
            System.out.println("Too many tries! 😔");
        }
    }
}