package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final Random RANDOM = new Random();


    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRound();
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static String[] generateRound() {
        int length = generateNumber(MIN_LENGTH, MAX_LENGTH);
        int start = generateNumber(MIN_START, MAX_START);
        int step = generateNumber(MIN_STEP, MAX_STEP);
        int hiddenPosition = generateNumber(0, length - 1);

        String progression = buildProgression(start, step, length, hiddenPosition);
        int hiddenNumber = calculateHiddenNumber(start, step, hiddenPosition);

        String question = progression.trim();
        String answer = Integer.toString(hiddenNumber);

        return new String[] {question, answer};
    }

    private static String buildProgression(int start, int step, int length, int hiddenPosition) {
        StringBuilder progression = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i == hiddenPosition) {
                progression.append(".. ");
            } else {
                int currentNumber = start + i * step;
                progression.append(currentNumber).append(" ");
            }
        }

        return progression.toString();
    }

    private static int calculateHiddenNumber(int start, int step, int hiddenPosition) {
        return start + hiddenPosition * step;
    }

    private static int generateNumber(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }
}
