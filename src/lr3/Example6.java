package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
            do {
                System.out.printf("Input %d element (must have remainder two by dividing five):\n", i);
                while (!in.hasNextInt()) {
                    System.out.println("That's not a number!");
                    in.next();
                }
                numbers[i] = in.nextInt();
            } while (numbers[i] % 5 != 2);
        }

        System.out.println("Your array:");
        System.out.print("[");
        for (int num : numbers) {
            System.out.printf(" %d", num);
        }
        System.out.print(" ]");

        in.close();
    }
}
