package hexlet.code.games;

import hexlet.code.GameUtils;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;

    public static String[] makeStep() {
        var randomNum1 = GameUtils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
        var randomNum2 = GameUtils.getRandomInt(MIN_NUMBER, MAX_NUMBER);

        String question = "Question: " + randomNum1 + " " + randomNum2;
        String correctAnswer = String.valueOf(getGcd(randomNum1, randomNum2));
        return new String[]{question, correctAnswer};
    }
    public static int getGcd(int num1, int num2) {
        return num1 == 0 ? num2 : getGcd(num2 % num1, num1);
    }
    public static String getRules() {
        return RULES;
    }
}
