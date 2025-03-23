package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int sum = 0;
        boolean isNone = false;
        String result = "";

        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();

            if (grade == 3) {
                isNone = true;
                break;
            }

            sum += grade;
        }

        double avg = sum * 1.0 / n;

        if (isNone) {
            result = "None";
        } else if (avg == 5) {
            result = "Named";
        } else if (avg >= 4.5) {
            result = "High";
        } else if (avg >= 4) {
            result = "Common";
        }

        out.print(result);

        in.close();
        out.flush();
    }
}
