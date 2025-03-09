package timus;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class task1025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int[] groups = new int[k];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = in.nextInt();
        }

        int targetGroupsCount = k / 2 + 1;
        Arrays.sort(groups);

        int sum = 0;

        for (int i = 0; i < targetGroupsCount; i++) {
            sum += groups[i] / 2 + 1;
        }

        out.print(sum);

        in.close();
        out.flush();
    }
}
