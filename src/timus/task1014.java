package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        String s = "";

        if (n == 0) {
            s = "01";
        } else if (n == 1) {
            s = "1";
        }

        while (n > 1) {
            int j;
            for (j = 9; j > 1; j--) {
                if (n % j == 0) {
                    s = s.concat(String.valueOf(j));
                    n /= j;
                    break;
                }
            }

            if (j == 1) {
                s = "1-";
                break;
            }
        }

        s = new StringBuilder(s).reverse().toString();
        out.println(s);

        in.close();
        out.flush();
    }
}
