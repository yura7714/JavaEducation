package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int MAX_NUMERAL_SYSTEM = 36;

        String input = in.nextLine();
        int k;
        for (k = 2; k <= MAX_NUMERAL_SYSTEM; k++) {
            int maxNumeralSystemValue = k - 1;

            int digitsSum = 0;
            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                int digit = Character.getNumericValue(symbol);

                if (digit > maxNumeralSystemValue) {
                    digitsSum = -1;
                    break;
                }

                digitsSum += digit;
            }

            if (digitsSum == -1) {
                continue;
            }

            // Если основание системы счисления равно k, то любое число делится на k-1 тогда и только тогда,
            // когда сумма его цифр делится на k-1 без остатка.
            if (digitsSum % maxNumeralSystemValue == 0) {
                out.println(k);
                break;
            }
        }

        if (k > MAX_NUMERAL_SYSTEM) {
            out.println("No solution.");
        }

        in.close();
        out.flush();
    }
}
