package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int MENU_GREET = 1;
    private static final int MENU_EVEN = 2;
    private static final int MENU_CALC = 3;
    private static final int MENU_GCD = 4;
    private static final int MENU_PROGRESSION = 5;
    private static final int MENU_PRIME = 6;

    public static void main(String[] args) {
        printMenu();
        int choice = getChoice();
        runGame(choice);
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    private static int getChoice() {
        Scanner scanner = new Scanner(System.in);

        try {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
                return choice;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    private static void runGame(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case MENU_GREET:
                Cli.greet();
                break;
            case MENU_EVEN:
                Even.start();
                break;
            case MENU_CALC:
                Calc.start();
                break;
            case MENU_GCD:
                Gcd.start();
                break;
            case MENU_PROGRESSION:
                Progression.start();
                break;
            case MENU_PRIME:
                Prime.start();
                break;
            default:
                System.out.println("Unknown user choice: " + choice);
        }
    }
}
