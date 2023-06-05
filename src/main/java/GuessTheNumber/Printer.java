package GuessTheNumber;

public class Printer {
    static void displayTitle() {
        System.out.println("-===========================-");
        System.out.println("=== GUESS THE NUMBER GAME ===");
        System.out.println("-===========================-");
    }
    static void displayRules() {
        System.out.println("Guess the number (between 1 and 100)!");
    }
    static void displayCorrectAnswer(int number) {
        System.out.println("debug : the expected number is " + number);
    }

    static void displayWinMessage(int attempts) {
        System.out.println("You found it after " + attempts + " tries!");
    }

    static void displayFailMessage(Divergence divergence, int attempts, int maxAttempts) {
        System.out.println("Wrong! Your number is " + divergence.toString().toLowerCase() + " than the correct one. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");
    }

    static void displayWrongEntryMessage(String input, int attempts, int maxAttempts) {
        System.out.println("Your input was '" + input + "', please enter a valid integer. " + (maxAttempts-attempts) + "/" + maxAttempts + " tries left");

    }

    static void displayLoseMessage(int maxAttempts, int number) {
        System.out.println("You lose after " + maxAttempts + " tries, the expected number was " + number);
    }

    static void askRetry() {
        System.out.println("----------------------------------------------------");
        System.out.println("Do you want to try again with a new number (yes/no)?");
    }

    static void displayGoodBye() {
        System.out.println("== Thanks for playing! ==");
    }
}
