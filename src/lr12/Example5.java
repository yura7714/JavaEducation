package lr12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_SIZE = 24;
        int[] numbers = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers[i] = random.nextInt(30);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Max value: " + getMaxMultiThreading(numbers));
    }

    private static int getMaxMultiThreading(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int maxValue = array[0];

        int cores = Runtime.getRuntime().availableProcessors();
        int[] maxValuesFromThreads = new int[cores];
        int lastIndex = array.length - 1;
        int partLength = (int) Math.ceil(((double) lastIndex) / cores); // lastIndex, потому что не берём в расчёт первый элемент


        List<Thread> threadList = new LinkedList<>();
        for (int i = 0; i < cores; i++) {
            int finalI = i;
            Thread t = new Thread(() -> {
                int partStartIndex = finalI * partLength + 1;
                if (partStartIndex > lastIndex) { // потоков больше, чем доступно элементов в массиве
                    return;
                }
                int partEndIndex = Math.min(partStartIndex + partLength - 1, lastIndex); // последний поток обработает меньше элементов, чем partLength
                int partMax = array[partStartIndex];
                for (int j = partStartIndex + 1; j <= partEndIndex; j++) {
                    if (array[j] > partMax) {
                        partMax = array[j];
                    }
                }

                maxValuesFromThreads[finalI] = partMax;
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

        for (int num: maxValuesFromThreads) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }
}
