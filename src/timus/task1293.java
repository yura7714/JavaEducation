package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1293 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        out.println(n * a * b * 2);
        out.flush();
    }
}
