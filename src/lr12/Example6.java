package lr12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_SIZE = 25;
        int[] numbers = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers[i] = random.nextInt(30);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of array values: " + getSumMultiThreading(numbers));
        System.out.println("Verify: " + Arrays.stream(numbers).sum());
    }

    private static int getSumMultiThreading(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int totalSum = 0;

        int cores = Runtime.getRuntime().availableProcessors();
        int[] sumFromThreads = new int[cores];
        int lastIndex = array.length - 1;
        int partLength = (int) Math.ceil(((double) array.length) / cores);

        List<Thread> threadList = new LinkedList<>();
        for (int i = 0; i < cores; i++) {
            int finalI = i;
            Thread t = new Thread(() -> {
                int partStartIndex = finalI * partLength;
                if (partStartIndex > lastIndex) { // потоков больше, чем доступно элементов в массиве
                    return;
                }
                int partEndIndex = Math.min(partStartIndex + partLength - 1, lastIndex); // последний поток обработает меньше элементов, чем partLength
                int partSum = 0;
                for (int j = partStartIndex; j <= partEndIndex; j++) {
                    partSum += array[j];
                }

                sumFromThreads[finalI] = partSum;
            });
            t.start();
            threadList.add(t);
        }

        threadList.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        for (int sum: sumFromThreads) {
            totalSum += sum;
        }

        return totalSum;
    }
}
