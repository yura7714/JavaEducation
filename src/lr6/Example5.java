package lr6;

import java.util.Random;

class SumOfSquares {
    public static int getValue(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * i;
        }

        return sum;
    }
}

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(15);
        System.out.println("Sum 1^2+2^2+3^2+...+n^2 where n = " + number + " is " + SumOfSquares.getValue(number));
        System.out.println("Verify n(n+1)(2n+1)/6: " + number * (number + 1) * (number * 2 + 1) / 6);
    }
}
