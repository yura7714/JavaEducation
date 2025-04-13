package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, больше которого должны быть длины строк:");

        while (!in.hasNextInt()) {
            System.out.println("Введено не число! Попробуйте ещё раз:");
            in.next();
        }

        int minStrLen = in.nextInt();

        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержащий только те строки, " +
                "которые имеют длину больше заданного значения.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования:\n");
        for (String e: strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterByMinLength(strings, minStrLen);

        System.out.println("\nСтрока после преобразования:\n");
        for (String e: stringsAfter) {
            System.out.println(e);
        }

        in.close();
    }

    private static List<String> filterByMinLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
