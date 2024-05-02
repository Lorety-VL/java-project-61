package hexlet.code.games;

import hexlet.code.GameUtils;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_INCREMENT = 50;
    private static final int MAX_START_ELEMENT = 50;

    public static String[] makeStep() {
        int currentLength = GameUtils.getRandomInt(MIN_LENGTH, MAX_LENGTH);
        int missingElementId = GameUtils.getRandomInt(currentLength - 1);
        int startElement = GameUtils.getRandomInt(MAX_START_ELEMENT);
        int increment = GameUtils.getRandomInt(MAX_INCREMENT);
        String[] progression = new String[currentLength];
        progression[0] = String.valueOf(startElement);

        for (int i = 1; i < currentLength; i++) {
            progression[i] = String.valueOf(startElement + (i * increment));
        }

        String correctAnswer = String.valueOf(progression[missingElementId]);
        progression[missingElementId] = "..";

        String question = String.join(" ", progression);
        return new String[]{question, correctAnswer};
    }

    public static String getRules() {
        return RULES;
    }
}
