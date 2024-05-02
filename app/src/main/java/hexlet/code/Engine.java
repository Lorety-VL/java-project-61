package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;
    public static void startGame(String gameId) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        var sc = new Scanner(System.in);
        String name = sc.next();
        String rules = getRulesByGameId(Integer.parseInt(gameId));
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            var gameData = getGameDataByGameId(Integer.parseInt(gameId));
            String question = gameData[0];
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
    public static String getRulesByGameId(int id) {
        if (id == 2) {
            return Even.getRules();
        } else if (id == 4) {
            return Gcd.getRules();
        } else {
            return Calc.getRules();
        }
    }
    public static String[] getGameDataByGameId(int gameId) {
        if (gameId == 2) {
            return Even.makeStep();
        } else if (gameId == 4) {
            return Gcd.makeStep();
        } else {
            return Calc.makeStep();
        }
    }
}
