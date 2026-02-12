package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = Utils.generateNumber(1, MAX_NUMBER);
            int b = Utils.generateNumber(1, MAX_NUMBER);

            int correctAnswer = gcd(a, b);
            String question = a + " " + b;

            roundsData[i][0] = question;
            roundsData[i][1] = Integer.toString(correctAnswer);
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}