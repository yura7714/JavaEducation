package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int BASKETS_COUNT = 2;
        final int WEIGHTINGS_COUNT = 3;

        int[][] weightings = new int[WEIGHTINGS_COUNT][BASKETS_COUNT];

        for (int i = 0; i < WEIGHTINGS_COUNT; i++) {
            for (int j = 0; j < BASKETS_COUNT; j++) {
                weightings[i][j] = in.nextInt();
            }
        }

        int secondBasketWeight = weightings[1][1];
        int firstBasketWeight = weightings[2][0];

        out.println((weightings[0][0] - firstBasketWeight) + " " + (weightings[0][1] - secondBasketWeight));

        in.close();
        out.flush();
    }
}
