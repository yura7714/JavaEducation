package lr6;

import java.util.Arrays;
import java.util.Random;

class IntegerArrayOperations {
    static int getMax(int... args) {
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > max) {
                max = args[i];
            }
        }
        return max;
    }

    static int getMin(int... args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    static double getAverage(int... args) {
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        return (double) sum / args.length;
    }
}

public class Example3 {
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

        System.out.println("Min value:" + IntegerArrayOperations.getMin(array));
        System.out.println("Max value:" + IntegerArrayOperations.getMax(array));
        System.out.println("Average value:" + IntegerArrayOperations.getAverage(array));

        int num1 = random.nextInt(MIN_BOUND, MAX_BOUND), num2 = random.nextInt(MIN_BOUND, MAX_BOUND);
        System.out.println("Integers:");
        System.out.println(num1 + " " + num2);

        System.out.println("Min value:" + IntegerArrayOperations.getMin(num1, num2));
        System.out.println("Max value:" + IntegerArrayOperations.getMax(num1, num2));
        System.out.println("Average value:" + IntegerArrayOperations.getAverage(num1, num2));
    }
}
