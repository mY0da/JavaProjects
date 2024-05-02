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
    }
}