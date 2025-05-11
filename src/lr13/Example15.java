package lr13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];

        int sum = 0, positiveCnt = 0;

        for (int i = 0; i < nums.length; ) {
            System.out.println("Input next integer element:");
            try {
                nums[i] = in.nextInt();
                if (nums[i] > 0) {
                    sum += nums[i];
                    positiveCnt++;
                }
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input is not integer! Try again.");
                in.next();
            }
        }

        System.out.println(Arrays.toString(nums));
        try {
            int avg = sum / positiveCnt;
            System.out.println("avg of positive elements: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("no positive elements in array");
        }

        in.close();
    }
}
