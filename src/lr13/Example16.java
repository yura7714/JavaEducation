package lr13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        boolean flag = true;
        while (flag) {
            System.out.println("Input column index: ");
            try {
                int col = in.nextInt();
                for (int[] ints : matrix) {
                    System.out.println(ints[col]);
                }
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Input is not integer!");
                in.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No such column in array!");
            }
        }

        in.close();
    }
}
