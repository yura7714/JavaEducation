package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, больше которого должны быть остальные числа:");

        while (!in.hasNextInt()) {
            System.out.println("Введено не число! Попробуйте ещё раз:");
            in.next();
        }

        int minNum = in.nextInt();

        List<Integer> integers = new ArrayList<>();

        Random random = new Random();

        System.out.println("Список до:\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(50));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterByMinValue(integers, minNum);

        System.out.println("Список чисел, которые больше указанного значения:\n");

        for (Integer i: integersAfter) {
            System.out.println(i);
        }

        in.close();
    }

    private static List<Integer> filterByMinValue(List<Integer> integers, int minValue) {
        return integers.stream().filter(x -> x > minValue).collect(Collectors.toList());
    }
}
