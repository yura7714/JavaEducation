package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = Year.now().getValue();

        System.out.println("Input your name:");
        String name = in.nextLine();

        System.out.println("Input year of your birth:");
        int birthYear = in.nextInt();

        System.out.printf("%s, your age is about %d years", name, currentYear - birthYear);
    }
}
