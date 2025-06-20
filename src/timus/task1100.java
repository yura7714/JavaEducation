package timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class TeamTask {
    private int rawOrder;
    private int id;
    private int solvedTasks;

    public int getRawOrder() {
        return rawOrder;
    }

    public void setRawOrder(int rawOrder) {
        this.rawOrder = rawOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSolvedTasks() {
        return solvedTasks;
    }

    public void setSolvedTasks(int solvedTasks) {
        this.solvedTasks = solvedTasks;
    }

    public TeamTask(int rawOrder, int id, int solvedTasks) {
        setRawOrder(rawOrder);
        setId(id);
        setSolvedTasks(solvedTasks);
    }
}

public class task1100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        List<TeamTask> teamTasks = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            int solvedTasks = in.nextInt();
            teamTasks.add(new TeamTask(i, id, solvedTasks));
        }

        List<TeamTask> result = teamTasks.stream()
                .sorted(Comparator.comparing(TeamTask::getSolvedTasks).reversed().thenComparing(TeamTask::getRawOrder))
                .collect(Collectors.toList());

        for (TeamTask teamTask: result) {
            out.println(teamTask.getId() + " " + teamTask.getSolvedTasks());
        }

        in.close();
        out.flush();
    }
}
