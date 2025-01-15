package lr5;

import java.util.Scanner;

class IntNumber {
    private int value;

    final int MIN_VALUE = 0;
    final int MAX_VALUE = 100;

    IntNumber(int value) {
        setValue(value);
    }

    IntNumber() {
        setValue();
    }

    public void setValue(int value) {
        if (value > MAX_VALUE) {
            value = MAX_VALUE;
        }

        this.value = value;
    }

    public void setValue() {
        value = MIN_VALUE;
    }

    public int getValue() {
        return this.value;
    }
}

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input value of int number:");
        while (!in.hasNextInt()) {
            System.out.println("That's not a number!");
            in.next();
        }

        IntNumber intNumberWithEnteredValue = new IntNumber(in.nextInt());
        IntNumber intNumberWithDefaultValue = new IntNumber();

        System.out.println("IntNumber with entered value: " + intNumberWithEnteredValue.getValue());
        System.out.println("IntNumber with default value: " + intNumberWithDefaultValue.getValue());

        in.close();
    }
}
