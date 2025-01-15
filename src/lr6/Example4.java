package lr6;

import java.util.Random;

class DoubleFactorial {
    public static long getValue(int number) {
        long result;

        if (number <= 2) {
            return number;
        }

        result = number * getValue(number - 2);
        return result;
    }
}

public class Example4 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("6!! = " + DoubleFactorial.getValue(6));
        System.out.println("5!! = " + DoubleFactorial.getValue(5));

        int number = random.nextInt(30);
        System.out.println(number + "!! = " + DoubleFactorial.getValue(number));
        number = random.nextInt(30);
        System.out.println(number + "!! = " + DoubleFactorial.getValue(number));
    }
}
