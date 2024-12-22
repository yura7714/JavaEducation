package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbersCount, numbersSum = 0;
        do {
            System.out.println("Input count of numbers to sum:");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            numbersCount = in.nextInt();
        } while (numbersCount <= 0);
        
        System.out.println("Sum of numbers with remainder two by dividing five or remainder one by dividing three (for solution):");
        for (int i = 1; i <= numbersCount; i++) {
            int currentNum;
            if (i % 2 == 0) {
                currentNum = i * 5 + 2;
            } else {
                currentNum = i * 3 + 1;
            }

            numbersSum += currentNum;

            System.out.print(currentNum);
            if (i < numbersCount) {
                System.out.print("+");
            } else {
                System.out.printf("=%d\n", numbersSum);
            }
        }

        System.out.println("Sum of numbers with remainder two by dividing five or remainder one by dividing three (while solution):");
        int summedNumbers = 1;
        numbersSum = 0;
        while (summedNumbers <= numbersCount) {
            int currentNum;
            if (summedNumbers % 2 == 0) {
                currentNum = summedNumbers * 5 + 2;
            } else {
                currentNum = summedNumbers * 3 + 1;
            }

            numbersSum += currentNum;

            System.out.print(currentNum);
            if (summedNumbers < numbersCount) {
                System.out.print("+");
            } else {
                System.out.printf("=%d\n", numbersSum);
            }
            summedNumbers++;
        }

        System.out.println("Sum of numbers with remainder two by dividing five or remainder one by dividing three (do-while solution):");
        summedNumbers = 1;
        numbersSum = 0;
        do {
            int currentNum;
            if (summedNumbers % 2 == 0) {
                currentNum = summedNumbers * 5 + 2;
            } else {
                currentNum = summedNumbers * 3 + 1;
            }

            numbersSum += currentNum;

            System.out.print(currentNum);
            if (summedNumbers < numbersCount) {
                System.out.print("+");
            } else {
                System.out.printf("=%d\n", numbersSum);
            }
            summedNumbers++;
        } while (summedNumbers <= numbersCount);

        in.close();
    }
}
