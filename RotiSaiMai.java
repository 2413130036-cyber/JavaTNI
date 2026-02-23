public class RotiSaiMai extends Bakery {

    private int setCount;
    private String cottonCandyFlavor;

    public RotiSaiMai(int setCount, String cottonCandyFlavor, String flourFlavor, double unitPrice) {
        super(flourFlavor, unitPrice);
        this.setCount = setCount;
        this.cottonCandyFlavor = cottonCandyFlavor;
    }

    public double getExtraWrapCost() {
        return setCount * 5;
    }

    @Override
    public int getPackingCost() {
        if (setCount >= 3)
            return 12;
        return super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice() {
        return (setCount * getunitPrice())
                + getExtraWrapCost()
                + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRoti Sai Mai (" + cottonCandyFlavor + ") "
                + setCount + " sets"
                + "\nTotal price of Roti Sai Mai = " + calculateTotalPrice();
    }
}
