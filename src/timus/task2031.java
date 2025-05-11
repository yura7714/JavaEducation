package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        String[] possibleValues = {"16", "06", "68", "88"};

        if (n <= 4) {
            for (int i = 0; i < n; i++) {
                out.print(possibleValues[i] + " ");
            }
        } else {
            out.println("Glupenky Pierre");
        }

        in.close();
        out.flush();
    }
}
