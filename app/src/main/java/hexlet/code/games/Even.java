package hexlet.code.games;

import hexlet.code.GameUtils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[] makeStep() {
        var randomInt = GameUtils.getRandomInt(2, 100);
        String question = "Question: " + randomInt;
        String correctAnswer = randomInt % 2 == 0 ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }
    public static String getRules() {
        return RULES;
    }
}
