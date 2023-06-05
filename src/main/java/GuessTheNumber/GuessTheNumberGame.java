package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;


public class GuessTheNumberGame {
    public void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int attempts = 0;
        int maxAttempts = 10;


        Printer.displayTitle();
        boolean continuePlaying = true;

        while(continuePlaying) {
            Printer.displayRules();
            int number = generator.nextInt(100) + 1;
            UserTry userTry = new UserTry(userGuess, attempts);
            Printer.displayCorrectAnswer(number);
            while (userTry.hasGuessed(number) && userTry.attemptsAreLeft(maxAttempts)) {
                userTry.nextAttempt();
                userGuess = TriedNumber.choose(attempts, maxAttempts);

                    if (userTry.hasGuessed(number)) {
                        Printer.displayWinMessage(attempts);
                    } else {
                        Printer.displayFailMessage(userTry.getDivergence(number), attempts, maxAttempts);
                    }
            }

            if (!userTry.hasGuessed(number)) {
                Printer.displayLoseMessage(maxAttempts, number);
            }

            Printer.askRetry();
            String userResponse = scanner.nextLine().trim().toLowerCase();
            continuePlaying = userResponse.equals("yes");
            if (continuePlaying) {
                userTry = UserTry.newOne();
            }
        }

        Printer.displayGoodBye();
        scanner.close();
    }
}