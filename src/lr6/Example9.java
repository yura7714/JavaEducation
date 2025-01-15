package lr6;

import java.util.Arrays;
import java.util.Random;

public class Example9 {
    static void swapArrayElements(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
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

        swapArrayElements(array);

        System.out.println("Array after swap:");
        System.out.println(Arrays.toString(array));
    }
}
