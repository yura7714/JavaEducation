package lr13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] nums = new byte[5];

        int sum = 0;

        for (int i = 0; i < nums.length; ) {
            System.out.println("Input integer in [-128;127]");
            try {
                nums[i] = in.nextByte();
                sum += nums[i];
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input is not integer in [-128;127]! Try again");
                in.next();
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("sum of elements = " + sum);

        in.close();
    }
}
