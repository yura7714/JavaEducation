package lr8.example12;

import java.io.*;

public class Example12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("A:\\My\\Example12_source.txt")));

            out = new PrintWriter("A:\\My\\Example12.txt");

            String s;

            System.out.println("Source file content: ");

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

            br.close();

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("A:\\My\\Example12_source.txt")));

            int lineCount = 0;

            while ((s = br.readLine()) != null) {
                lineCount++;

                String[] words = s.split(" ");

                int pickedWords = 0;

                for (String word: words) {
                    if (word.matches("^(?ui:[^аеёиоуыэюя]).*")) {
                        out.println(lineCount + ": " + word);
                        pickedWords++;
                    }
                }

                System.out.println("Picked " + pickedWords + " words from " + lineCount + " line");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
