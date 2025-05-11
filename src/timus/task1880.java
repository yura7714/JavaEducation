package timus;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class task1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        HashSet<Integer> firstPersonNumbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            firstPersonNumbers.add(in.nextInt());
        }

        HashSet<Integer> commonNumbers = new HashSet<>();
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (firstPersonNumbers.contains(num)) {
                commonNumbers.add(num);
            }
        }

        int commonNumbersCount = 0;
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (commonNumbers.contains(num)) {
                commonNumbersCount++;
            }
        }

        out.println(commonNumbersCount);

        in.close();
        out.flush();
    }
}
