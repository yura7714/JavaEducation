package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
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

        int[][] transposedMatrix = new int[columns][rows];

        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        in.close();
    }
}
