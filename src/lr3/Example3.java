package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentMember = 1;
        int nextMember = 1;
        int membersCount;

        do {
            System.out.println("Input count of members in Fibonacci sequence (positive number):");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            membersCount = in.nextInt();
        } while (membersCount <= 0);

        int currentMemberNumber = 1;

        System.out.println("Fibonacci sequence (while loop solution):");
        while (currentMemberNumber <= membersCount) {
            System.out.print(currentMember);
            if (currentMemberNumber < membersCount) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

            currentMemberNumber++;
            int prevMember = currentMember;
            currentMember = nextMember;
            nextMember = currentMember + prevMember;
        }

        currentMemberNumber = 1;
        currentMember = 1;
        nextMember = 1;

        System.out.println("Fibonacci sequence (do-while loop solution):");
        do {
            System.out.print(currentMember);
            if (currentMemberNumber < membersCount) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

            currentMemberNumber++;
            int prevMember = currentMember;
            currentMember = nextMember;
            nextMember = currentMember + prevMember;
        } while (currentMemberNumber <= membersCount);

        currentMember = 1;
        nextMember = 1;

        System.out.println("Fibonacci sequence (for loop solution):");
        for (int i = 1; i <= membersCount; i++) {
            System.out.print(currentMember);
            if (i < membersCount) {
                System.out.print(", ");
            }

            int prevMember = currentMember;
            currentMember = nextMember;
            nextMember = currentMember + prevMember;
        }

        in.close();
    }
}
