package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int row, col = 0;

        for (int i = 0; i < n;) {
            row = i;
            for (int j = col; j <= i; j++, row--) {
                out.print(arr[row][j] + " ");
            }

            // если строка не последняя, то перейти на следующую ИЛИ если выведена последняя колонка на последней
            // строке, то завершить цикл
            if (i < n - 1 || col == n - 1) {
                i++;
            } else {
                col++;
            }
        }

        in.close();
        out.flush();
    }
}
