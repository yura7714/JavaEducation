package timus;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class task1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        BigInteger n = in.nextBigInteger();
        out.print(n.remainder(BigInteger.valueOf(7)));

        in.close();
        out.flush();
    }
}
