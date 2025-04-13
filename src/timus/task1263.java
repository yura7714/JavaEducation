package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] votes = new int[n];

        for (int i = 0; i < m; i++) {
            votes[in.nextInt() - 1]++;
        }

        for (int i: votes) {
            out.println(String.format("%.2f", 100.0 * i / m) + "%");
        }

        in.close();
        out.flush();
    }
}
