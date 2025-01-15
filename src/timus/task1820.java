package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int orderedSteaks = in.nextInt();
        int steaksInParallel = in.nextInt();
        final int MINUTES_FOR_ONE_STEAK = 2;

        int minutesForAllSteaks = MINUTES_FOR_ONE_STEAK * orderedSteaks;
        int result;

        if (steaksInParallel >= orderedSteaks) {
            result = MINUTES_FOR_ONE_STEAK;
        } else {
            result = (int)Math.ceil(minutesForAllSteaks * 1.0 / steaksInParallel);
        }

        out.print(result);

        in.close();
        out.flush();
    }
}
