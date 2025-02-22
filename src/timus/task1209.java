package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long x = in.nextInt() - 1;

            long y = (long)Math.sqrt(8 * x + 1); // если 8x + 1 полный квадрат, то х - треугольное число
            if ((y * y) == (8 * x + 1)) {
                out.print("1 ");
            } else {
                out.print("0 ");
            }
        }

        in.close();
        out.flush();
    }
}
