package timus;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class task1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        in.nextLine();
        HashSet<String> shops = new HashSet<>();
        int missingShopsCount = 0;

        for (int i = 0; i < n; i++) {
            if (!shops.add(in.nextLine())) {
                missingShopsCount++;
            }
        }

        out.println(missingShopsCount);

        in.close();
        out.flush();
    }
}
