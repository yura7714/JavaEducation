package lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
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

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(200);
        }

        System.out.println("Массив arr:");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr);

        System.out.println("Массив arrResult:");
        System.out.println(Arrays.toString(arrResult));

        in.close();
    }

    private static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
