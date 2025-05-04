package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int maxStrength = 0;
        int doorIndexWithMaxStrength = 0;
        int prePrevDoorStrength = in.nextInt();
        int prevDoorStrength = in.nextInt();

        for (int i = 3; i <= n; i++) {
            int currentDoorStrength = in.nextInt();
            int totalStrength = prePrevDoorStrength + prevDoorStrength + currentDoorStrength;
            if (totalStrength > maxStrength) {
                maxStrength = totalStrength;
                doorIndexWithMaxStrength = i - 1;
            }

            prePrevDoorStrength = prevDoorStrength;
            prevDoorStrength = currentDoorStrength;
        }

        out.println(maxStrength + " " + doorIndexWithMaxStrength);

        in.close();
        out.flush();
    }
}
