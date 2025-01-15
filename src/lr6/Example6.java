package lr6;

import java.util.Arrays;
import java.util.Random;

class IntegerArrayActions {
    public static int[] sliceArray(int[] array, int elementsCount) {
        int[] newArray = new int[Math.min(elementsCount, array.length)];

        System.arraycopy(array, 0, newArray, 0, newArray.length);
        return newArray;
    }
}

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();

        final int MIN_BOUND = -10;
        final int MAX_BOUND = 10;

        int[] array = new int[random.nextInt(2,10)];

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MIN_BOUND,MAX_BOUND);
        }
        System.out.println(Arrays.toString(array));

        int elementsToCopy = random.nextInt(1, 15);
        System.out.println("Copy first " + elementsToCopy + " elements of array:");
        int[] newArray = IntegerArrayActions.sliceArray(array, elementsToCopy);
        System.out.println(Arrays.toString(newArray));
    }
}
