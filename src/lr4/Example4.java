package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int triangleSide;

        do {
            System.out.println("Input side of triangle (positive number):");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            triangleSide = in.nextInt();
        } while (triangleSide <= 0);

        int[][] triangle = new int[triangleSide][];

        int valueToFill = 2;

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            Arrays.fill(triangle[i], valueToFill);
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }

        in.close();
    }
}
