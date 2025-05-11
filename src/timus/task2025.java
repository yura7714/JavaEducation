package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        int totalPersonMatches;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int matchesPerTeam = k - 1;
            int totalTeamMatches = (1 + matchesPerTeam) * matchesPerTeam / 2; // сумма арифметической прогрессии

            int playersPerTeam = n / k;
            totalPersonMatches = playersPerTeam * playersPerTeam * totalTeamMatches;

            int teamsWithAdditionalPlayer = n % k;
            if (teamsWithAdditionalPlayer > 0) {
                for (int j = 1; j <= teamsWithAdditionalPlayer; j++) {
                    int teamsWithAdditionalPlayerLeft = teamsWithAdditionalPlayer - j;
                    totalPersonMatches += teamsWithAdditionalPlayerLeft * (playersPerTeam + 1) // схватки с командами, где тоже есть +1 игрок
                            + (matchesPerTeam - teamsWithAdditionalPlayerLeft - (j - 1)) * playersPerTeam // схватки с командами, где нет +1 игрока
                            + playersPerTeam * teamsWithAdditionalPlayerLeft; // схватки игроков текущей команды с командами, где есть +1 игрок
                }
            }

            out.println(totalPersonMatches);
        }

        in.close();
        out.flush();
    }
}
