package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input current day of week:");
        String weekDay = in.nextLine();

        System.out.println("Input current month:");
        String month = in.nextLine();

        System.out.println("Input current day number:");
        int dayNum = in.nextInt();

        System.out.printf("Current day is %s, %d of %s", weekDay, dayNum, month);
    }
}
