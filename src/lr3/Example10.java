package lr3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int size;

        do {
            System.out.println("Input array size (positive number):");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            size = in.nextInt();
        } while (size <= 0);

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Array:");
        System.out.print("[");
        for (int number: numbers) {
            System.out.printf(" %s", number);
        }
        System.out.println(" ]");

        Arrays.sort(numbers);

        int i = 0;
        int j = numbers.length - 1;
        int temp;

        while (j > i) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j--;
            i++;
        }

        System.out.println("Reverse ordered array:");
        System.out.print("[");
        for (int number: numbers) {
            System.out.printf(" %s", number);
        }
        System.out.println(" ]");

        in.close();
    }
}
