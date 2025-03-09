package lr8.example9;

import java.io.*;

public class Example9 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
// Создание потоков для чтения и записи с нужной кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("A:\\My\\Example9_source.txt"), "cp1251"));

            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("A:\\My\\Example9.txt"), "cp1251"));
// Переписывание информации из одного файла в другой
            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s); // запись без перевода строки
                bw.newLine(); // принудительный переход на новую строку
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        } finally {
            try {
                br.close();
                bw.flush();
                bw.close();
            } catch (Exception e) {
                System.out.println("Ошибка: " + e);
            }

        }

    }
}
