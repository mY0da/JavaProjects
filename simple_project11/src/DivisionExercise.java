import java.util.Scanner;

public class DivisionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the numerator: ");
        double numerator = scanner.nextInt();

        System.out.println("Choose the denominator: ");
        double denominator = scanner.nextInt();

        try {
            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Can't divide by 0.");
        }
    }
}