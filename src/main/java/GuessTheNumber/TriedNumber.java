package GuessTheNumber;

import java.util.Scanner;

public class TriedNumber {
    int value;


    public TriedNumber(int value) {

        this.value = value;
    }

    static int choose(int attempts, int maxAttempts) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int value = 0;
        try {
          value = Integer.parseInt(input);
          return value;
        } catch (NumberFormatException e) {
            Printer.displayWrongEntryMessage(input, attempts, maxAttempts);
        }
        return value;
    }


}
