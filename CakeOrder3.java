import javax.swing.*;

public class CakeOrder3 {

    public static void main(String[] args) {

        double pound = Double.parseDouble(
                JOptionPane.showInputDialog("Enter pound:"));

        String flavor =
                JOptionPane.showInputDialog("Enter flavor:");

        String message =
                JOptionPane.showInputDialog("Enter message:");

        BirthdayCake order =
                new BirthdayCake(message, pound, flavor, 400);

        while (true) {

            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    order.toString() + "\nConfirm this order?",
                    "Confirm",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(
                        null,
                        "Order Confirmed!\n" + order
                );
                break;

            } else {

                message = JOptionPane.showInputDialog("Change message:");
                order.changeMessage(message);
            }
        }
    }
}
