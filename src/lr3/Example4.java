package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int minNum, maxNum;

        System.out.println("Input first integer number:");
        while (!in.hasNextInt()) {
            System.out.println("That's not a number!");
            in.next();
        }
        minNum = in.nextInt();

        System.out.println("Input second integer number:");
        while (!in.hasNextInt()) {
            System.out.println("That's not a number!");
            in.next();
        }
        maxNum = in.nextInt();

        if (minNum > maxNum) {
            int tempNum = minNum;
            minNum = maxNum;
            maxNum = tempNum;
        }

        System.out.printf("Integers from %d to %d (for loop solution)\n", minNum, maxNum);
        for (int i = minNum; i <= maxNum; i++) {
            System.out.print(i);
            if (i < maxNum) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.printf("Integers from %d to %d (while loop solution)\n", minNum, maxNum);
        int currentNum = minNum;
        while (currentNum <= maxNum) {
            System.out.print(currentNum);
            if (currentNum < maxNum) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
            currentNum++;
        }

        System.out.printf("Integers from %d to %d (do-while loop solution)\n", minNum, maxNum);
        currentNum = minNum;
        do {
            System.out.print(currentNum);
            if (currentNum < maxNum) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
            currentNum++;
        } while (currentNum <= maxNum);

        in.close();
    }
}
