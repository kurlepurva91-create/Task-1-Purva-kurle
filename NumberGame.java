javac NumberGame.javaimport java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("======================================");
        System.out.println("          JAVA NUMBER GAME");
        System.out.println("======================================");
        System.out.println("Guess the random number between 1 and 100.");
        System.out.println("You have 10 attempts in each round.");

        while (playAgain) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean correct = false;

            System.out.println("\n--------------------------------------");
            System.out.println("              NEW ROUND");
            System.out.println("--------------------------------------");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number from 1 to 100.");
                    continue;
                }

                attempts++;

                if (guess == number) {
                    correct = true;
                    int roundScore = maxAttempts - attempts + 1;
                    totalScore += roundScore;

                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Attempts used: " + attempts);
                    System.out.println("Round score: " + roundScore);
                    break;
                }

                if (guess < number) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (!correct) {
                System.out.println("You have used all your attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("Total score: " + totalScore);

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String answer = scanner.next();

            playAgain = answer.equalsIgnoreCase("yes")
                    || answer.equalsIgnoreCase("y");
        }

        System.out.println("\n======================================");
        System.out.println("              GAME OVER");
        System.out.println("======================================");
        System.out.println("Final Score: " + totalScore);
        System.out.println("Thank you for playing!");
        System.out.println("======================================");

        scanner.close();
    }
}
