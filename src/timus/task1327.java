package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int res;
        if (a % 2 == 0 && b % 2 == 0) {
            res = b - a;
        } else if (a % 2 != 0 && b % 2 != 0) {
            res = b - a + 2;
        } else {
            res = b - a + 1;
        }

        res /= 2;

        out.print(res);

        in.close();
        out.flush();
    }
}
