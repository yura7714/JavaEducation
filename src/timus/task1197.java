package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] cellsForPos = new int[n];

        for (int i = 0; i < n; i++) {
            String pos = in.next();
            int v = pos.charAt(0) - 'a' + 1;
            int h = pos.charAt(1) - '0';

            int cells = 0;

            if (h > 1 && v > 2) {
                cells += 1;
            }
            if (h > 1 && v < 7) {
                cells += 1;
            }
            if (h > 2 && v > 1) {
                cells += 1;
            }
            if (h > 2 && v < 8) {
                cells += 1;
            }

            if (h < 8 && v > 2) {
                cells += 1;
            }
            if (h < 8 && v < 7) {
                cells += 1;
            }
            if (h < 7 && v > 1) {
                cells += 1;
            }
            if (h < 7 && v < 8) {
                cells += 1;
            }

            cellsForPos[i] = cells;
        }

        for (int i = 0; i < cellsForPos.length; i++) {
            out.println(cellsForPos[i]);
        }

        in.close();
        out.flush();
    }
}
