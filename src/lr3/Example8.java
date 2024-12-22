package lr3;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10;
        char[] letters = new char[size];

        final int LETTER_DIFFERENCE = 1;
        final String LETTERS_TO_SKIP = "AEIOU";

        char letterASCIICode = 'A';

        for (int i = 0; i < letters.length; letterASCIICode += LETTER_DIFFERENCE) {
            if (LETTERS_TO_SKIP.indexOf(letterASCIICode) < 0) {
                letters[i] = letterASCIICode;
                i++;
            }
        }

        System.out.println("Array:");
        System.out.print("[");
        for (char letter: letters) {
            System.out.printf(" %s", letter);
        }
        System.out.println(" ]");

        in.close();
    }
}
