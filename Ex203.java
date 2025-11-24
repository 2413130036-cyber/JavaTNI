import javax.swing.*;

public class Ex203 {
    public static  void main(String[] args) {
        final int lecture_price = 1900;
        final int lab_price =  3500;

        int lecture_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit:"));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit:"));

        int lecture_total_price = lecture_credit * lecture_price;
        int lab_total_price =  lab_credit  * lab_price;
        int total_price = lecture_total_price + lab_total_price;

    }
}
