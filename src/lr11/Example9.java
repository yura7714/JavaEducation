package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "52", "Символы", "0_0", "winwin");
        System.out.println("\nСтрока после сплитования:\n");
        for (String e: strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterOnlyLetters(strings);

        System.out.println("\nСтрока после преобразования:\n");
        for (String e: stringsAfter) {
            System.out.println(e);
        }
    }

    private static List<String> filterOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
