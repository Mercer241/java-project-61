package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(100) + 1;
            String question = Integer.toString(number);
            String correctAnswer = isEven(number) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}