package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] peopleToTeams = new int[n];
        int[][] relations = new int[n][n];

        for (int i = 0; i < n;) {
            int person = in.nextInt();
            if (person == 0) {
                i++;
                continue;
            }

            relations[i][person - 1] = 1;
        }

        int peopleInFirstTeam = 0;

        for (int i = 0; i < relations.length; i++) {
            boolean hasFriendsInFirstTeam = false;
            boolean hasFriends = false;

            int j;
            for (j = 0; j < relations[i].length; j++) {
                if (relations[i][j] == 0) {
                    continue;
                }

                hasFriends = true;

                if (peopleToTeams[j] == 1) {
                    hasFriendsInFirstTeam = true;
                    break;
                }
            }

            if (!hasFriends) {
                peopleInFirstTeam = 0;
                break;
            }

            if (!hasFriendsInFirstTeam) {
                peopleToTeams[i] = 1;
                peopleInFirstTeam++;
            }
        }

        out.println(peopleInFirstTeam);

        for (int i = 0; i < peopleToTeams.length; i++) {
            if (peopleToTeams[i] == 1) {
                out.print(i + 1 + " ");
            }
        }

        in.close();
        out.flush();
    }
}
