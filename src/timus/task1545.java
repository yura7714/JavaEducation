package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        String[] combinations = new String[n];

        for (int i = 0; i < combinations.length; i++) {
            combinations[i] = in.next();
        }

        String firstChar = in.next();

        for (String combination : combinations) {
            if (combination.startsWith(firstChar)) {
                out.println(combination);
            }
        }

        in.close();
        out.flush();
    }
}
