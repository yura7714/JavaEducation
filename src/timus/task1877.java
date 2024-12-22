package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int START_CODE = 0;

        int firstLockCode = in.nextInt();
        int secondLockCode = in.nextInt();

        String result = "no";

        if (((firstLockCode % 2) == (START_CODE % 2)) || ((secondLockCode % 2) == ((START_CODE + 1) % 2))) {
            result = "yes";
        }

        out.println(result);

        in.close();
        out.flush();
    }
}
