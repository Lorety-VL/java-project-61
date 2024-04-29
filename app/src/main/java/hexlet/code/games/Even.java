package hexlet.code.games;

import hexlet.code.GameUtils;
import java.util.Scanner;

public class Even {
    public static void startGame() {
        System.out.println("Welcome to the Brain Games!");
        var sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var roundsCount = 3;
        for (int i = 0; i < roundsCount; i++) {
            var gameData = makeStep();
            String question = gameData[0];
            String correctAnswer = gameData[1];
            System.out.println(question);
            System.out.print("Your answer: ");
            var userAnswer = sc.next();
            if (!correctAnswer.equals(userAnswer)) {
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
    public static String[] makeStep() {
        var randomInt = GameUtils.getRandomInt(2, 100);
        String question = "Question: " + randomInt;
        String correctAnswer = randomInt % 2 == 0 ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }
}
