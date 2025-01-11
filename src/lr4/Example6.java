package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
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

        System.out.println("Source matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int rowIndexToRemove = random.nextInt(matrix.length);
        int columnIndexToRemove = random.nextInt(matrix[rowIndexToRemove].length);

        int[][] formattedMatrix = new int[matrix.length - 1][matrix[0].length - 1];

        System.out.printf("Formatted matrix without row with index %d and column with index %d:\n",
                rowIndexToRemove,
                columnIndexToRemove);
        for (int i = 0, k = 0; i < matrix.length; i++) {
            if (i == rowIndexToRemove) {
                continue;
            }
            for (int j = 0, l = 0; j < matrix[i].length; j++) {
                if (j == columnIndexToRemove) {
                    continue;
                }
                formattedMatrix[k][l] = matrix[i][j];
                System.out.print(formattedMatrix[k][l] + "\t");
                l++;
            }
            k++;
            System.out.println();
        }

        in.close();
    }
}
