package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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

        int[][] rectangle = new int[rows][columns];

        int valueToFill = 2;

        for(int[] row: rectangle) {
            Arrays.fill(row, valueToFill);
        }

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }

        in.close();
    }
}
