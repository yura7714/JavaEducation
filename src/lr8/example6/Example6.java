package lr8.example6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("A:\\My\\Example6_source.txt");
            out = new FileWriter("A:\\My\\Example6.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                // out.write((char)oneByte); // запись с уничтожением ранее существующих данных
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        } finally {
            in.close();
            out.close();
        }
    }
}
