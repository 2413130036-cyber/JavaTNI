public class Bakery {

    private String flavor;
    private double unitPrice;
    private int packingCost = 5;

    public Bakery(String flavor, double unitPrice) {
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public double getunitPrice() {
        return this.unitPrice;
    }

    public int getPackingCost() {
        return this.packingCost;
    }

    public double calculateTotalPrice() {
        return this.unitPrice + this.packingCost;
    }

    @Override
    public String toString() {
        return "Thank you for your order!";
    }
}
