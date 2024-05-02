package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;
    public static void startGame(String gameId) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        var sc = new Scanner(System.in);
        String name = sc.next();
        String rules = getRulesByGameId(gameId);
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            var gameData = getGameDataByGameId(gameId);
            String question = "Question: " + gameData[0];
            String correctAnswer = gameData[1];
            System.out.println(question + "\nYour answer: ");
            String userAnswer = sc.next();
            if (!correctAnswer.equals(userAnswer)) {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\nLet's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String getRulesByGameId(String gameId) {
        return switch (gameId) {
            case "2" -> Even.getRules();
            case "3" -> Calc.getRules();
            case "4" -> Gcd.getRules();
            case "5" -> Progression.getRules();
            default -> Prime.getRules();
        };
    }
    public static String[] getGameDataByGameId(String gameId) {
        return switch (gameId) {
            case "2" -> Even.makeStep();
            case "3" -> Calc.makeStep();
            case "4" -> Gcd.makeStep();
            case "5" -> Progression.makeStep();
            default -> Prime.makeStep();
        };
    }
}
