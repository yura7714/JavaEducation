package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a name of day in week:");
        String dayName = in.nextLine();

        int dayNumber = switch (dayName.toUpperCase()) {
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            case "WEDNESDAY" -> 3;
            case "THURSDAY" -> 4;
            case "FRIDAY" -> 5;
            case "SATURDAY" -> 6;
            case "SUNDAY" -> 7;
            default -> 0;
        };
        
        System.out.println("Switch-case solution:");
        if (dayNumber == 0) {
            System.out.println("Invalid name of day");
        } else {
            System.out.printf("Number of %s is %d\n", dayName, dayNumber);
        }
        
        if (dayName.equalsIgnoreCase("Monday")) {
            dayNumber = 1;
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            dayNumber = 2;
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            dayNumber = 3;
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            dayNumber = 4;
        } else if (dayName.equalsIgnoreCase("Friday")) {
            dayNumber = 5;
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            dayNumber = 6;
        } else if (dayName.equalsIgnoreCase("Sunday")) {
            dayNumber = 7;
        } else {
            dayNumber = 0;
        }

        System.out.println("If-else-if solution:");
        if (dayNumber == 0) {
            System.out.println("Invalid name of day");
        } else {
            System.out.printf("Number of %s is %d", dayName, dayNumber);
        }

        in.close();
    }
}
