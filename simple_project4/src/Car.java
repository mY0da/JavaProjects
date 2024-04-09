public class Car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrices(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public void showInfo() {
        String info = String.format("""
        Model: %s.
        Price Year 1: %s
        Price Year 2: %s
        Price Year 3: %s
        """, model, priceYear1, priceYear2, priceYear3);
        System.out.println(info);
    }

    private double getLowestPrice() {
        double lowestPrice = priceYear1;

        if (priceYear2 < lowestPrice) {
            lowestPrice = priceYear2;
        }

        if (priceYear3 < lowestPrice) {
            lowestPrice = priceYear3;
        }

        return lowestPrice;
    }

    private double getHighestPrice() {
        double highestPrice = priceYear1;

        if (priceYear2 < highestPrice) {
            highestPrice = priceYear2;
        }

        if (priceYear3 < highestPrice) {
            highestPrice = priceYear3;
        }

        return highestPrice;
    }
}
