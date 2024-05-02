package hexlet.code.games;

import hexlet.code.GameUtils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUMBER = 2;
    private static final int MAX_NUMBER = 100;

    public static String[] makeStep() {
        int randomInt = GameUtils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
        String question = String.valueOf(randomInt);
        String correctAnswer = randomInt % 2 == 0 ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }
    public static String getRules() {
        return RULES;
    }
}
