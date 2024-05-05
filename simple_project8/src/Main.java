import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringsList = new ArrayList<>();

        Collections.addAll(stringsList, "Python", "Java", "GO", "JavaScript", "C++");
        stringsList.forEach(System.out::println);

        Dog dog = new Dog();
        Animal animal = (Animal) dog;

        Animal animal1 = new Dog();
        if (animal1 instanceof Dog) {
            Dog dog1 = (Dog) animal;
        } else {
            System.out.println("The object is not a Dog.");
        }

        Product product1 = new Product("Product-A", 2000.0);
        Product product2 = new Product("Product-B", 164.99);
        Product product3 = new Product("Product-C", 85.0);

        ArrayList<Product> productsList = new ArrayList<>();
        Collections.addAll(productsList, product1, product2, product3);

        double priceSum = 0;
        for (Product product : productsList) {
            priceSum+=product.getPrice();
        }

        double averagePrice = priceSum / productsList.size();
        System.out.println("Products' average price: " + averagePrice);

        Circle circle = new Circle();
        circle.radius = 5;

        Square square = new Square();
        square.side = 4;

        ArrayList<Shape> shapesList = new ArrayList<>();
        Collections.addAll(shapesList, circle, square);

        for (Shape shape : shapesList) {
            System.out.println("Area: " + shape.calculateArea());
        }

        BankAccount account1 = new BankAccount(101, 1500.0);
        BankAccount account2 = new BankAccount(102, 2500.0);
        BankAccount account3 = new BankAccount(103, 1900.0);

        ArrayList<BankAccount> accountsList = new ArrayList<>();
        Collections.addAll(accountsList, account1, account2, account3);

        BankAccount accountBiggestBalance = accountsList.get(0);
        for (BankAccount account : accountsList) {
            if (account.getBalance() > accountBiggestBalance.getBalance()) {
                accountBiggestBalance = account;
            }
        }

        System.out.println("Account with biggest balance - Number: " + accountBiggestBalance.getAccountNumber() +
                ", Balance: " + accountBiggestBalance.getBalance());
    }
}