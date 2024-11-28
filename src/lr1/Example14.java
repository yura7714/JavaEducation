package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number:");
        float num = in.nextFloat();
        float prevNum = num - 1;
        float nextNum = num + 1;
        float sum = num + prevNum + nextNum;

        System.out.printf("Sequence is %f, %f, %f, %f", prevNum, num, nextNum, sum * sum);
    }
}
