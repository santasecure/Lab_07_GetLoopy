import java.util.Scanner;
import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {
        // Create Scanner and Random
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String goAgain;

        do {
            int rollCount = 0;
            int die1, die2, die3, sum;

            // Header
            System.out.printf("%-8s%-8s%-8s%-8s%-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            do {
                rollCount++;
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                sum = die1 + die2 + die3;

                // Display one roll line
                System.out.printf("%-8d%-8d%-8d%-8d%-5d%n", rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3)); // stop at triple

            // Ask if user wants to go again
            System.out.print("\nTriple! Roll again? (Y/N): ");
            goAgain = in.nextLine();

        } while (goAgain.equalsIgnoreCase("Y"));
    }
}
