package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int columns, rows;

        do {
            System.out.println("Input number of columns (positive number):");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            columns = in.nextInt();
        } while (columns <= 0);

        do {
            System.out.println("Input number of rows (positive number):");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            rows = in.nextInt();
        } while (rows <= 0);

        int[][] matrix = new int[rows][columns];

        final int RANDOM_BOUND = 50;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(RANDOM_BOUND);
                    System.out.printf("Generated %d at [%d][%d]\n", matrix[i][j], i, j);
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[i][j] = random.nextInt(RANDOM_BOUND);
                    System.out.printf("Generated %d at [%d][%d]\n", matrix[i][j], i, j);
                }
            }

            System.out.println();
        }

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        in.close();
    }
}
