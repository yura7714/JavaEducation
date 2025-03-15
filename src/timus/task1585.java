package timus;

import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class task1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        in.nextLine();

        Hashtable<String, Integer> penguins = new Hashtable<>();

        penguins.put("Emperor Penguin", 0);
        penguins.put("Macaroni Penguin", 0);
        penguins.put("Little Penguin", 0);

        for (int i = 0; i < n; i++) {
            String currentPenguin = in.nextLine();
            penguins.put(currentPenguin, penguins.get(currentPenguin) + 1);
        }

        int max = 0;
        String penguinsWithMax = "";

        for (Map.Entry<String, Integer> entry: penguins.entrySet()) {
            int currentPenguinsCount = entry.getValue();

            if (currentPenguinsCount > max) {
                max = currentPenguinsCount;
                penguinsWithMax = entry.getKey();
            }
        }

        out.println(penguinsWithMax);

        in.close();
        out.flush();
    }
}
