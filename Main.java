import java.util.Scanner;

/**
 * This program combines two mini-games: Guessing Game and Rock-Paper-Scissors.
 * It allows users to select and play each game multiple times.
 *
 * @author Berk
 * @author Pablo
 * @since 2025-03-24
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        while (keepPlaying) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    GuessingGame.play(scanner);
                    break;
                case 2:
                    RockPaperScissors.play(scanner);
                    break;
                case 3:
                    keepPlaying = false;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }

    /** Shows the main menu. */
    public static void showMenu() {
        System.out.println("\\nWhich game would you like to play?");
        System.out.println("1. Guessing Game");
        System.out.println("2. Rock-Paper-Scissors");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }
}
