package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int currentNumCount = 1;
        int prevNum = in.nextInt();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < n; i++) {
            int currentNum = in.nextInt();
            if (currentNum == prevNum) {
                currentNumCount++;
            } else {
                stringBuilder.append(currentNumCount).append(" ").append(prevNum).append(" ");

                currentNumCount = 1;
                prevNum = currentNum;
            }
        }

        stringBuilder.append(currentNumCount).append(" ").append(prevNum);

        out.print(stringBuilder);

        in.close();
        out.flush();
    }
}
