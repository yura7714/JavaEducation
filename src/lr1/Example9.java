package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input month:");
        String month = in.nextLine();

        System.out.printf("Input number of days in %s:\n", month);
        int daysNumber = in.nextInt();

        System.out.printf("%s contains %d days", month, daysNumber);
    }
}
