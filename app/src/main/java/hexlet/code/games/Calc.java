package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final int MAX_NUMBER = 50;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = Utils.generateNumber(1, MAX_NUMBER);
            int b = Utils.generateNumber(1, MAX_NUMBER);
            String operation = OPERATIONS[Utils.generateNumber(0, OPERATIONS.length - 1)];

            String question = a + " " + operation + " " + b;
            int correctAnswer = calculate(a, b, operation);
            String correctAnswerStr = String.valueOf(correctAnswer);

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswerStr;
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static int calculate(int num1, int num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            default: return 0;
        }
    }
}