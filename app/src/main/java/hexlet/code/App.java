package hexlet.code;

import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        var sc = new Scanner(System.in);
        var userChoice = sc.next();
        switch (userChoice) {
            case "2":
                Even.startGame();
                break;
            case "1":
                Cli.greeting();
                break;
            case "0":
            default:
                break;
        }
    }
}
