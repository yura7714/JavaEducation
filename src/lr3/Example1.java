package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dayNumber;

        do {
            System.out.println("Input number of day in week (from 1 to 7):");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            dayNumber = in.nextInt();
        } while (dayNumber <= 0);

        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "not a valid number of day";
        };

        System.out.printf("It's %s", dayName);

        in.close();
    }
}
