package lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size;

        do {
            System.out.println("Введите размер массива:");
            while (!in.hasNextInt()) {
                System.out.println("Введено не число! Попробуйте ещё раз:");
                in.next();
            }
            size = in.nextInt();
        } while (size <= 0);

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(20);
            arr2[i] = random.nextInt(20);
        }

        System.out.println("Массив arr1:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив arr2:");
        System.out.println(Arrays.toString(arr2));

        int[] arrResult = findCommonElements(arr1, arr2);

        System.out.println("Массив arrResult:");
        System.out.println(Arrays.toString(arrResult));

        in.close();
    }

    private static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).filter(x -> Arrays.stream(arr2)
                .anyMatch(y -> y == x))
                .toArray();
    }
}
