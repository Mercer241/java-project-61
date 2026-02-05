package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class App {
    public static String USER_NAME;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                greet();
                break;
            case 2:
                Even.start();
                break;
            case 3:
                Calc.start();
                break;
            case 4:
                Gcd.start();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        USER_NAME = scanner.nextLine();
        System.out.println("Hello, " + USER_NAME + "!");
    }
}