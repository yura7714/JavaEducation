package lr9.example6;

import java.util.Scanner;

public class Recursion {
    public static String toBinaryString(int num) {
        String remainder = String.valueOf(num % 2);
        if (num / 2 == 0) {
            return remainder;
        }
        
        return toBinaryString(num / 2) + remainder;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input integer: ");
        int number = in.nextInt();
        System.out.print(toBinaryString(number));

        in.close();
    }
}
