package GuessTheNumber;

public class UserTry {
    int triedNumber;
    int attemptNumber;


    public UserTry(int triedNumber, int attemptNumber) {
        this.triedNumber = triedNumber;
        this.attemptNumber = attemptNumber;
    }

    boolean hasGuessed(int correctAnswer) {
        return triedNumber == correctAnswer;
    }

    boolean attemptsAreLeft(int maxAttempts) {
        return attemptNumber < maxAttempts;
    }

    void nextAttempt() {
        this.attemptNumber++;
    }

    Divergence getDivergence(int correctAnswer) {
        if (triedNumber < correctAnswer) {
            return Divergence.SMALLER;
        } else {
            return Divergence.GREATER;
        }
    }

    static UserTry newOne() {
        return new UserTry(0, 0);
    }


}
