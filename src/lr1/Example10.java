package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = Year.now().getValue();

        System.out.println("Input year of your birth:");
        int birthYear = in.nextInt();

        System.out.printf("Your age is about %d years", currentYear - birthYear);
    }
}
