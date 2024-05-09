import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Credit card limit: ");
        double limit = scanner.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0) {
            System.out.println("Purchase description: ");
            String description = scanner.next();

            System.out.println("Purchase value: ");
            double value = scanner.nextDouble();

            Purchase purchase = new Purchase(description, value);
            boolean purchaseMade = card.makePurchase(purchase);

            if (purchaseMade) {
                System.out.println("Purchase made successfully!");
                if (card.getBalance() == 0) {
                    System.out.println("Not enough money to continue shopping!");
                    exit = 0;
                } else {
                    System.out.println("Type 0 to exit or 1 to continue: ");
                    exit = scanner.nextInt();
                }
            } else {
                System.out.println("Insufficient balance!");
                exit = 0;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("PURCHASES MADE:\n");

        Collections.sort(card.getPurchases());
        for (Purchase p : card.getPurchases()) {
            System.out.println(p.getDescription() + "-" + p.getPrice());
        }
        System.out.println("\n------------------------------------");

        System.out.println("\nCard balance: " + card.getBalance());
    }
}
