package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = random.nextInt(50) + 1; // от 1 до 50
            int b = random.nextInt(50) + 1;
            String operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            String question = a + " " + operation + " " + b;
            String correctAnswer = calculate(a, b, operation);

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static String calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return Integer.toString(a + b);
            case "-":
                return Integer.toString(a - b);
            case "*":
                return Integer.toString(a * b);
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}