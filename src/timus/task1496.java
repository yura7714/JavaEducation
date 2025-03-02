package timus;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = in.next();
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                out.println(entry.getKey());
            }
        }

        in.close();
        out.flush();
    }
}
