package lr9.example7;

import java.util.Scanner;

public class Recursion {
    public static void inputArray(int index, int[] array, Scanner scanner) {
        if (index > 0) {
            inputArray(index - 1, array, scanner);
        }

        System.out.print("Input array element at index " + index + ": ");

        array[index] = scanner.nextInt();
    }

    public static void outputArray(int index, int[] array) {
        if (index > 0) {
            outputArray(index - 1, array);
        } else {
            System.out.print("Array elements: ");
        }

        System.out.print(array[index] + (index == array.length - 1 ? "" : ", "));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[5];
        inputArray(numbers.length - 1, numbers, in);
        outputArray(numbers.length - 1, numbers);

        in.close();
    }
}
