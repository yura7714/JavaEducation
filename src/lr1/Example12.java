package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = Year.now().getValue();

        System.out.println("Input your age:");
        int age = in.nextInt();

        int approximateBirthYear = currentYear - age;

        System.out.printf("Your year of birth is %d or %d", approximateBirthYear - 1, approximateBirthYear);
    }
}
