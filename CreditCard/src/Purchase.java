public class Purchase implements Comparable<Purchase> {
    private String description;
    private double price;

    public Purchase(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Purchase: description = " + description +
                " | price = " + price;
    }

    @Override
    public int compareTo(Purchase anotherPurchase) {
        return Double.compare(this.price, anotherPurchase.price);
    }
}
