package lr3;

import java.util.Scanner;
import java.util.Random;

public class Example9 {
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
        int[] minElementIndices = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Array:");
        System.out.print("[");
        for (int number: numbers) {
            System.out.printf(" %s", number);
        }
        System.out.println(" ]");

        int minElement = numbers[0];
        minElementIndices[0] = 0;

        for (int i = 1, j = 1; i < numbers.length; i++) {
            if (numbers[i] == minElement) {
                minElementIndices[j] = i;
                j++;
            }
            if (numbers[i] < minElement) {
                minElement = numbers[i];
                minElementIndices = new int[size];
                j = 0;
                minElementIndices[j] = i;
                j++;
            }
        }

        System.out.printf("Min element in array: %d\n", minElement);
        System.out.print("Indices of min element in array: ");
        for (int i = 0; i < minElementIndices.length; i++) {
            if (i == minElementIndices.length - 1 || minElementIndices[i + 1] == 0) { // если это последний индекс минимальных элементов
                System.out.printf("%d", minElementIndices[i]);
                break;
            } else {
                System.out.printf("%d, ", minElementIndices[i]);
            }
        }

        in.close();
    }
}
