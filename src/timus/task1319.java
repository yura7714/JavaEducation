package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1319 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int firstCellNumber = 1;
        int initialTermProgression = 0;
        int progressionDifference = 1;

        int topLeft = firstCellNumber + n * (2 * initialTermProgression + (n - 1) * progressionDifference) / 2;

        out.println(topLeft);

        out.flush();
    }
}
