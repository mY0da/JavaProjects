import java.util.Scanner;

public class PasswordExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a password: ");
        String password = scanner.nextLine();

        try {
            passwordValidation(password);
            System.out.println("Valid password!");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void passwordValidation(String password) {
        if (password.length() < 8) {
            throw new InvalidPasswordException("The password must have more than 8 characters.");
        }
    }
}
