package lr5;

import java.util.Scanner;

class Parameter {
    private int max, min;

    Parameter(int max, int min) {
        setMaxMin(max, min);
    }

    Parameter(int value) {
        setMaxMin(value);
    }

    public void setMaxMin(int max, int min) {
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }

        this.max = Math.max(this.max, max);
        this.min = Math.min(this.min, min);
    }

    public void setMaxMin(int value) {
        setMaxMin(value, value);
    }

    public void print() {
        System.out.println("Min value: " + this.min);
        System.out.println("Max value: " + this.max);
    }
}

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstInt, secondInt;

        System.out.println("Input first integer:");
        while (!in.hasNextInt()) {
            System.out.println("That's not an integer!");
            in.next();
        }
        firstInt = in.nextInt();

        System.out.println("Input second integer:");
        while (!in.hasNextInt()) {
            System.out.println("That's not an integer!");
            in.next();
        }
        secondInt = in.nextInt();

        Parameter parameter = new Parameter(firstInt, secondInt);

        parameter.print();

        System.out.println("Input another integer:");
        while (!in.hasNextInt()) {
            System.out.println("That's not an integer!");
            in.next();
        }

        parameter.setMaxMin(in.nextInt());

        parameter.print();

        in.close();
    }
}
