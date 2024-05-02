package hexlet.code.games;

import hexlet.code.GameUtils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] SIGNS = new String[]{"+", "-", "*"};
    private static final int MAX_OPERAND = 100;

    public static String[] makeStep() {
        int firstOperand = GameUtils.getRandomInt(MAX_OPERAND);
        int secondOperand = GameUtils.getRandomInt(MAX_OPERAND);
        String sign = SIGNS[GameUtils.getRandomInt(2)];
        String question = firstOperand + " " + sign + " " + secondOperand;
        String correctAnswer = switch (sign) {
            case "+" -> String.valueOf(firstOperand + secondOperand);
            case "-" -> String.valueOf(firstOperand - secondOperand);
            default -> String.valueOf(firstOperand * secondOperand);
        };
        return new String[]{question, correctAnswer};
    }
    public static String getRules() {
        return RULES;
    }
}
