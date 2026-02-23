public class BirthdayCake extends Bakery {

    private String message;
    private double pound;

    public BirthdayCake(String message, double pound, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.message = message;
        this.pound = pound;
    }

    public void changeMessage(String newMessage) {
        this.message = newMessage;
    }

    @Override
    public int getPackingCost() {
        if (pound >= 3)
            return 10;
        return super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice() {
        return (getunitPrice() * pound) + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + getFlavor() + " birthday cake (message=" + message + ")"
                + "\nTotal price of Birthday Cake = " + calculateTotalPrice();
    }
}
