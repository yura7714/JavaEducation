package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите делитель:");

        while (!in.hasNextInt()) {
            System.out.println("Введено не число! Попробуйте ещё раз:");
            in.next();
        }

        int divider = in.nextInt();

        List<Integer> integers = new ArrayList<>();

        Random random = new Random();

        System.out.println("Список до:\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(50));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterProportionalNumbers(integers, divider);

        System.out.println("Список чисел, которые делятся без остатка:\n");

        for (Integer i: integersAfter) {
            System.out.println(i);
        }

        in.close();
    }

    private static List<Integer> filterProportionalNumbers(List<Integer> integers, int divider) {
        return integers.stream().filter(x -> x % divider == 0).collect(Collectors.toList());
    }
}
