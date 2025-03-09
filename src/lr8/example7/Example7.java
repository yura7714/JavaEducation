package lr8.example7;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            // создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("A:\\My\\Example7_source.txt"), 1024);
            out = new BufferedWriter(new FileWriter("A:\\My\\Example7.txt"));

            int lineCount = 0;
            String s;
            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
