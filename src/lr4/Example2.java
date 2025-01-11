package lr4;

import java.util.Scanner;

public class Example2 {
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

        for (int i = 0; i < triangleSide; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        in.close();
    }
}
