public class PerishableProduct extends Product {
    private String validDate;

    public PerishableProduct(String name, double price, int quantity, String validDate) {
        super(name, price, quantity);
        this.validDate = validDate;
    }
}
