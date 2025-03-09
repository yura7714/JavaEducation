package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextLine().length() - 1;

        int factorial = 1;
        int current = n;

        while (current > 0) {
            factorial *= current;
            current -= k;
        }

        out.print(factorial);

        in.close();
        out.flush();
    }
}
