package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите строку для поиска:");
        String search = in.nextLine();

        String string = "Напишите функцию,которая принимает на вход список " +
                "строк и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования:\n");
        for (String e: strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterMatchingString(strings, search);

        System.out.println("\nСтрока после преобразования:\n");
        for (String e: stringsAfter) {
            System.out.println(e);
        }

        in.close();
    }

    private static List<String> filterMatchingString(List<String> strings, String search) {
        return strings.stream()
                .filter(s -> s.contains(search))
                .collect(Collectors.toList());
    }
}
