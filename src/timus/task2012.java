package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int TOTAL_TASKS_COUNT = 12;
        final int MINUTES_LIMIT_PER_TASK = 45;
        final int HOURS_WITH_MINUTES_LIMIT_PER_TASK = 4;
        final int MINUTES_IN_HOUR = 60;
        final int TOTAL_MINUTES_LIMIT = HOURS_WITH_MINUTES_LIMIT_PER_TASK * MINUTES_IN_HOUR;

        int solvedTasksInFirstHour = in.nextInt();

        int tasksToSolveInRemainingHours = TOTAL_TASKS_COUNT - solvedTasksInFirstHour;
        String result;

        if (tasksToSolveInRemainingHours * MINUTES_LIMIT_PER_TASK <= TOTAL_MINUTES_LIMIT) {
            result = "YES";
        } else {
            result = "NO";
        }

        out.println(result);

        in.close();
        out.flush();
    }
}
