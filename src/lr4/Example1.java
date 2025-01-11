package lr4;

import java.util.Scanner;

public class Example1 {
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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        in.close();
    }
}
