package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();
        int c = in.nextInt();

        if (c > x + y) {
            out.println("Impossible");
        } else {
            int a = Math.min(Math.min(x, y), c);
            int b = c - a;

            if (b < 0) {
                b = 0;
            }

            if (x < y) {
                out.println(a + " " + b);
            } else {
                out.println(b + " " + a);
            }
        }

        in.close();
        out.flush();
    }
}
