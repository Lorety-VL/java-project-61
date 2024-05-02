package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Gcd");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.next();
        switch (userChoice) {
            case "2":
            case "3":
            case "4":
            case "5":
                Engine.startGame(userChoice);
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
