package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10;
        char[] letters = new char[size];

        final int LETTER_DIFFERENCE = 2;

        char letterASCIICode = 'a';

        for (int i = 0; i < letters.length; i++, letterASCIICode += LETTER_DIFFERENCE) {
            letters[i] = letterASCIICode;
        }

        System.out.println("Array:");
        System.out.print("[");
        for (char letter: letters) {
            System.out.printf(" %s", letter);
        }
        System.out.println(" ]");

        System.out.println("Reversed array:");
        System.out.print("[");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.printf(" %s", letters[i]);
        }
        System.out.println(" ]");

        in.close();
    }
}
