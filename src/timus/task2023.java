package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int steps = 0;
        int currentShelf = 1;
        int prevShelf = 1;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            CharSequence nameFirstLetter = in.next().subSequence(0, 1);
            prevShelf = currentShelf;
            if ("APOR".contains(nameFirstLetter)) {
                currentShelf = 1;
            } else if ("BMS".contains(nameFirstLetter)) {
                currentShelf = 2;
            } else if ("DGJKTW".contains(nameFirstLetter)) {
                currentShelf = 3;
            }

            steps += Math.abs(currentShelf - prevShelf);
        }

        out.print(steps);

        in.close();
        out.flush();
    }
}
