import java.util.Arrays;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");

        for (String input : inputs) {
            try {
                int age = Integer.parseInt(input.trim());
                if (age < 0) {
                    System.out.println("Invalid input: " + input);
                } else if (age >= 18) {
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not Eligible");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input);
            }
        }
        scanner.close();
    }
}
