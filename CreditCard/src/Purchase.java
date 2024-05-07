public class Purchase {
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
}
