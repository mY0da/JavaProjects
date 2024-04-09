import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String accountType = "Checking account";
        double amount = 2500.00;

        System.out.println("Account's client name:");
        String name = read.nextLine();

        String client = String.format("""
                ********************************************************
                Client's details:
                
                Name:               %s
                Account type:       %s
                Initial amount:     $%.2f
                ********************************************************
                """, name, accountType, amount);

        System.out.println(client);

        boolean exit = true;

        while (exit) {
            String options = """
                    Options
                    
                    1- Check your balance
                    2- Receive money
                    3- Transfer money
                    4- Exit
                    """;
            System.out.println(options);
            System.out.println("Choose desired option:");

            int choice = read.nextInt();

            if (choice == 1) {
                System.out.println("Current balance: " + amount + "\n");

            } else if (choice == 2) {
                System.out.println("How much are you receiving?");
                double add = read.nextDouble();

                if (add < 0) {
                    System.out.println("You can't add a negative amount!\n");
                } else {
                    amount += add;
                    System.out.println("Updated balance $" + amount + "\n");
                }

            } else if (choice == 3) {
                System.out.println("How much do you want to transfer?");
                double sub = read.nextDouble();

                if (sub <= amount) {
                    amount -= sub;
                    System.out.println("Updated balance $" + amount);
                } else {
                    System.out.println("You don't have that much money!\n");
                }

            } else if (choice == 4) {
                System.out.println("See you next time!");
                exit = false;

            } else {
                System.out.println("Option not valid!");
            }
        }
    }
}
