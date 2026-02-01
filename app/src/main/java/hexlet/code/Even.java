package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    private static final int ROUNDS_TO_WIN = 3;
    private static final int MAX_NUMBER = 100;

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        playRounds(scanner);
        scanner.close();
    }

    private static void playRounds(Scanner scanner) {
        Random random = new Random();

        // Получаем имя игрока ОДИН РАЗ
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < ROUNDS_TO_WIN; i++) {
            if (!playRound(scanner, random, playerName)) {
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

    private static boolean playRound(Scanner scanner, Random random, String playerName) {
        int number = random.nextInt(MAX_NUMBER) + 1;
        String correctAnswer = isEven(number) ? "yes" : "no";

        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine().toLowerCase();

        if (!userAnswer.equals(correctAnswer)) {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }

        System.out.println("Correct!");
        return true;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}