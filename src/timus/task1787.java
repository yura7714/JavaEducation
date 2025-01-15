package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int carsCanPassInMinute, minutesPassed;

        carsCanPassInMinute = in.nextInt();
        minutesPassed = in.nextInt();

        int carsLeft = 0;

        for (int i = 0; i < minutesPassed; i++) {
            carsLeft = Math.max(carsLeft + in.nextInt() - carsCanPassInMinute, 0);
        }

        out.print(carsLeft);

        in.close();
        out.flush();
    }
}
