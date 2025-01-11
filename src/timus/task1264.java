package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int arrayLength, lastNumber;

        arrayLength = in.nextInt();
        lastNumber = in.nextInt();

        out.println(arrayLength * (lastNumber + 1));

        in.close();
        out.flush();
    }
}
