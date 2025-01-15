package lr6;

import java.util.Arrays;
import java.util.Random;

class AvgValue {
    public static double getArrayAverage(int[] array) {
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        return (double) sum / array.length;
    }
}

public class Example8 {
    public static void main(String[] args) {
        Random random = new Random();

        final int MIN_BOUND = -10;
        final int MAX_BOUND = 10;

        int[] array = new int[random.nextInt(2,5)];

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MIN_BOUND,MAX_BOUND);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Average value:" + AvgValue.getArrayAverage(array));
    }
}
