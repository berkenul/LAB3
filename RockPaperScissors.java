import java.util.Random;
import java.util.Scanner;

/**
 * @author Berk
 * @since 2025-03-24
 */
public class RockPaperScissors {

    public static void play(Scanner scanner) {
        Random random = new Random();
        boolean playAgain;

        do {
            System.out.print("Do you want to play? (yes/no): ");
            scanner.nextLine(); // buffer temizle
            String start = scanner.nextLine().trim().toLowerCase();
            if (!start.equals("yes")) break;

            System.out.print("Enter your choice: 1. paper, 2. scissors, 3. rock: ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(3) + 1;

            String[] choices = {"paper", "scissors", "rock"};
            System.out.println("Computer chose: " + choices[computerChoice - 1]);

            if (userChoice == computerChoice) {
                System.out.println("It is a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            scanner.nextLine(); // temizle
            String again = scanner.nextLine().trim().toUpperCase();
            playAgain = again.equals("Y");
        } while (playAgain);
    }
}

