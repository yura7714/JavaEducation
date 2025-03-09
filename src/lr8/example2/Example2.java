package lr8.example2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
//    метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
//            с потоком связан файл
            InputStream inFile = new FileInputStream("A:\\Folder1\\Folder2\\Folder3\\text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

//            с потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

//            с потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4}); // byte -> int -> char
                                                                                        // под капотом приводит к выводу
                                                                                        // спецсимволов из начала
                                                                                        // ASCII-таблицы в консоль
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
