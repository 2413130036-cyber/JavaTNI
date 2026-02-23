import java.util.Scanner;

public class CakeOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday Cake Details:");
        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        System.out.print("Enter flavor: ");
        String flavor = scanner.next();

        System.out.print("Enter pound: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 =
                new BirthdayCake(message, pound, flavor, 350);

        System.out.println(order1);

        System.out.println("Cup Cake Details:");
        System.out.print("Enter flavor: ");
        String cupFlavor = scanner.next();

        System.out.print("Enter pieces: ");
        int piece = scanner.nextInt();

        CupCake order2 =
                new CupCake(piece, cupFlavor, 65);

        System.out.println(order2);

        System.out.println("Roti Sai Mai Details:");
        System.out.print("Enter flour flavor: ");
        String flourFlavor = scanner.next();

        System.out.print("Enter cotton candy flavor: ");
        String cottonFlavor = scanner.next();

        System.out.print("How many sets: ");
        int sets = scanner.nextInt();

        RotiSaiMai order3 =
                new RotiSaiMai(sets, cottonFlavor, flourFlavor, 45);

        System.out.println(order3);

        System.out.println("Grand Total = "
                + (order1.calculateTotalPrice()
                + order2.calculateTotalPrice()
                + order3.calculateTotalPrice()));
    }
}
