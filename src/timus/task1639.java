package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        String result;

        if (m * n % 2 == 0) {
            result = "[:=[first]";
        } else {
            result = "[second]=:]";
        }

        out.print(result);

        in.close();
        out.flush();
    }
}
