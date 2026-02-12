package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;  // ← ДОБАВИТЬ

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRound();
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static String[] generateRound() {
        int length = Utils.generateNumber(MIN_LENGTH, MAX_LENGTH);
        int start = Utils.generateNumber(MIN_START, MAX_START);
        int step = Utils.generateNumber(MIN_STEP, MAX_STEP);
        int hiddenPosition = Utils.generateNumber(0, length - 1);

        String question = buildProgression(start, step, length, hiddenPosition);
        int hiddenNumber = start + hiddenPosition * step;

        return new String[] {question, Integer.toString(hiddenNumber)};
    }

    private static String buildProgression(int start, int step, int length, int hiddenPosition) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            if (i == hiddenPosition) {
                progression[i] = "..";
            } else {
                progression[i] = Integer.toString(start + i * step);
            }
        }

        return String.join(" ", progression);
    }
}