import java.util.Scanner;

public class BikeRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int distance = Integer.parseInt(input);

            if (distance == 0 || distance < 0) {
                System.out.println("Invalid data.");
            } else if (distance < 30) {
                System.out.println("Hire can't be done.");
            } else {
                int cost = 0;

                if (distance <= 50) {
                    cost = distance * 100;
                } else if (distance <= 100) {
                    cost = (50 * 100) + ((distance - 50) * 80);
                } else {
                    cost = (50 * 100) + (50 * 80) + ((distance - 100) * 70);
                }

                System.out.println(cost);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid data.");
        }

        scanner.close();
    }
}
