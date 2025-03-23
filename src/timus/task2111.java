package timus;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class task2111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] roads = new int[n];
        int sum = 0;
        long tax = 0;

        for (int i = 0; i < n; i++) {
            int road = in.nextInt();
            roads[i] = road;
            sum += road;
        }

        Arrays.sort(roads);

        for (int i = 0; i < n; i++) {
            tax += (2L * sum - roads[i]) * roads[i];
            sum -= roads[i];
        }

        out.print(tax);

        in.close();
        out.flush();
    }
}
