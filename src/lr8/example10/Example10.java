package lr8.example10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br;
        PrintWriter out;
        try {
// Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("A:\\My\\Example10_source.txt"), "cp1251"));

            out = new PrintWriter("A:\\My\\Example10.txt", "cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.println(lineCount + ": " + s);
            }

            br.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
