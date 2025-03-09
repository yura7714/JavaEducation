package lr8.example11;

import java.io.*;

public class Example11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("A:\\My\\Example11_source.txt")));

            out = new PrintWriter("A:\\My\\Example11.txt");

            int lineCount = 0;
            String s;

            System.out.println("Source file content: ");

            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(s);

                if (lineCount == 2 || lineCount > 2 && Double.parseDouble(s) > 0) {
                    out.println(s);
                }
            }

            br.close();
            out.flush();
            out.close();

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("A:\\My\\Example11.txt")));

            System.out.println("Output file content:");

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        } finally {
            br.close();
        }
    }
}
