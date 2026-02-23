import java.util.Scanner;

public class Lab602 {

    public static int find_rank(double[] rate_scores, double score) {
        int rank = 1;

        for (double s : rate_scores) {
            if (s > score) {
                rank++;
            }
        }

        return rank;
    }

    public static void main(String[] args) {

        String[] movies = {
                "Me Before You",
                "Titanic",
                "Before Sunrise",
                "The Holiday",
                "A Walk to Remember"
        };

        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a movie title: ");
        String title = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < movies.length; i++) {

            if (movies[i].equalsIgnoreCase(title)) {

                System.out.println("The rating score of \""
                        + movies[i] + "\" is " + rate_scores[i]);

                int rank = find_rank(rate_scores, rate_scores[i]);

                System.out.println("The ranking of this movie is " + rank);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Cannot found this movie title...");
        }
    }
}
