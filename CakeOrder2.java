import java.util.Scanner;

public class CakeOrder2 {

    static Scanner scanner = new Scanner(System.in);

    public static String selectFlavor() {

        String[] flavors = {
                "Chocolate",
                "Vanilla",
                "Strawberry",
                "Lemon",
                "Red Velvet"
        };

        while (true) {

            System.out.println("Select flavor:");
            for (int i = 0; i < flavors.length; i++)
                System.out.println((i + 1) + ". " + flavors[i]);

            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= flavors.length)
                return flavors[choice - 1];

            System.out.println("Invalid flavor!! Try again!!");
        }
    }

    public static void main(String[] args) {

        System.out.println("1. Birthday Cake");
        System.out.println("2. Cup Cake");
        System.out.println("3. Roti Sai Mai");

        int option = scanner.nextInt();

        if (option == 1) {

            String flavor = selectFlavor();
            scanner.nextLine();

            System.out.print("Enter message: ");
            String msg = scanner.nextLine();

            System.out.print("Enter pound: ");
            double pound = scanner.nextDouble();

            BirthdayCake order =
                    new BirthdayCake(msg, pound, flavor, 350);

            System.out.println(order);

        } else if (option == 2) {

            String flavor = selectFlavor();

            System.out.print("Enter pieces: ");
            int piece = scanner.nextInt();

            CupCake order =
                    new CupCake(piece, flavor, 70);

            System.out.println(order);

        } else if (option == 3) {

            String flourFlavor = selectFlavor();

            System.out.print("Enter cotton candy flavor: ");
            String cottonFlavor = scanner.next();

            System.out.print("How many sets: ");
            int sets = scanner.nextInt();

            RotiSaiMai order =
                    new RotiSaiMai(sets, cottonFlavor, flourFlavor, 45);

            System.out.println(order);

        } else {
            System.out.println("Wrong option!! Try again!!");
        }
    }
}
