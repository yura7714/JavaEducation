package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        float firstOperand = in.nextFloat();

        System.out.println("Input second number:");
        float secondOperand = in.nextFloat();

        System.out.printf("%f + %f = %f, %f - %f = %f",
                firstOperand,
                secondOperand,
                firstOperand + secondOperand,
                firstOperand,
                secondOperand,
                firstOperand - secondOperand);
    }
}
