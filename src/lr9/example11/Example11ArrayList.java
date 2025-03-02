package lr9.example11;

import java.util.ArrayList;
import java.util.Scanner;

public class Example11ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> people = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();



        for (int i = 0; i < n; i++) {
            people.add(i);
        }

        System.out.println(people);

        long start = System.currentTimeMillis();

        if (people.size() > 1) {
            int indexForRemove = 1;
            while (people.size() > 1) {
                people.remove(indexForRemove);

                System.out.println(people);

                indexForRemove += 1;

                if (indexForRemove > people.size() - 1) {
                    indexForRemove -= people.size();
                }
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("Last person with index: " + people.getFirst());
        System.out.println("Time (ms): " + (end - start));

        in.close();
    }
}
