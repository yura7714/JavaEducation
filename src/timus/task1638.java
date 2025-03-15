package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1638 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int bookSheetsWidth = in.nextInt();
        int bookBindingWidth = in.nextInt();
        int firstBookNumber = in.nextInt();
        int lastBookNumber = in.nextInt();

        int booksDiff = Math.abs(firstBookNumber - lastBookNumber);

        int result = booksDiff * 2 * bookBindingWidth;

        if (firstBookNumber > lastBookNumber) {
            result += (booksDiff + 1) * bookSheetsWidth;
        } else {
            result += (booksDiff - 1) * bookSheetsWidth;
        }

        out.println(result);

        in.close();
        out.flush();
    }
}
