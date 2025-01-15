package lr5;

import java.util.Scanner;

class IntNumAndChar {
    int number;
    char symbol;

    IntNumAndChar(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    IntNumAndChar(double number) {
        this.number = (int)(number * 100 % 100);
        symbol = (char) (int) number;
    }
}

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;
        double realNumber;
        String input;

        System.out.println("Input int number:");
        while (!in.hasNextInt()) {
            System.out.println("That's not an int number!");
            in.next();
        }
        number = in.nextInt();

        do {
            System.out.println("Input one symbol:");
            input = in.next();
        } while (input.length() > 1);
        IntNumAndChar intWithEnteredValues = new IntNumAndChar(number, input.charAt(0));

        System.out.println("Input real number:");
        while (!in.hasNextDouble()) {
            System.out.println("That's not a real number!");
            in.next();
        }

        realNumber = in.nextDouble();

        IntNumAndChar intWithComputedValues = new IntNumAndChar(realNumber);

        System.out.printf("Entered int number: %d, symbol: %c\n",
                intWithEnteredValues.number,
                intWithEnteredValues.symbol);
        System.out.printf("Computed from real number. Int number: %d, symbol: %c",
                intWithComputedValues.number,
                intWithComputedValues.symbol);

        in.close();
    }
}
