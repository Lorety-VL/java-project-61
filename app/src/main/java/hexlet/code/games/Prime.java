package hexlet.code.games;

import hexlet.code.GameUtils;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 3;
    private static final int MAX_NUMBER = 100;

    public static String[] makeStep() {
        int randomNumber = GameUtils.getRandomInt(MIN_NUMBER, MAX_NUMBER);

        String question = String.valueOf(randomNumber);
        String correctAnswer = isPrime(randomNumber) ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getRules() {
        return RULES;
    }
}
