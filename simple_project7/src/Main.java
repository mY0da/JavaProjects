import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productsList = new ArrayList<>();

        Product productA = new Product("Product-A", 15.99, 5);
        Product productB = new Product("Product-B", 11.45, 8);
        Product productC = new Product("Product-C", 16.00, 3);
        PerishableProduct productD = new PerishableProduct("Product-D", 18.75, 10, "8-11-2024");

        Collections.addAll(productsList, productA, productB, productC, productD);
        System.out.println("List size: " + productsList.size());
        System.out.println("First product: " + productsList.get(0).getName());

        for (Product product : productsList) {
            System.out.println(product);
        }
    }
}