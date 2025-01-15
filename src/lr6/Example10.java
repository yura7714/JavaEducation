package lr6;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    static int[] getMaxMin(int... args) {
        int max = args[0];
        int min = args[0];

        for (int i = 1; i < args.length; i++) {
            if (args[i] > max) {
                max = args[i];
            }

            if (args[i] < min) {
                min = args[i];
            }
        }
        return new int[] {max, min};
    }

    public static void main(String[] args) {
        Random random = new Random();

        final int MIN_BOUND = -10;
        final int MAX_BOUND = 10;

        int[] array = new int[random.nextInt(2,10)];

        System.out.println("Source array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MIN_BOUND,MAX_BOUND);
        }
        System.out.println(Arrays.toString(array));

        int[] arrayMaxMin = getMaxMin(array);

        System.out.println("Max value: " + arrayMaxMin[0]);
        System.out.println("Min value: " + arrayMaxMin[1]);
    }
}
