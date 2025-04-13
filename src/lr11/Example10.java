package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, меньше которого должны быть остальные числа:");

        while (!in.hasNextInt()) {
            System.out.println("Введено не число! Попробуйте ещё раз:");
            in.next();
        }

        int maxNum = in.nextInt();

        List<Integer> integers = new ArrayList<>();

        Random random = new Random();

        System.out.println("Список до:\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(50));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterByMaxValue(integers, maxNum);

        System.out.println("Список чисел, которые меньше указанного значения:\n");

        for (Integer i: integersAfter) {
            System.out.println(i);
        }

        in.close();
    }

    private static List<Integer> filterByMaxValue(List<Integer> integers, int maxValue) {
        return integers.stream().filter(x -> x < maxValue).collect(Collectors.toList());
    }
}
