package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String textToEncrypt = in.nextLine();
        System.out.println("Введите ключ:");
        while (!in.hasNextInt()) {
            System.out.println("Введено не число!");
            in.next();
        }
        int key = in.nextInt();

        char[] textToEncryptChars = textToEncrypt.toCharArray();
        char[] encryptedTextChars = new char[textToEncryptChars.length];

        for (int i = 0; i < textToEncryptChars.length; i++) {
            encryptedTextChars[i] = (char) (textToEncryptChars[i] + key);
        }

        String encryptedText = new String(encryptedTextChars);

        System.out.printf("Текст после преобразования: %s\n", encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");

        String answer = in.next();
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Введите корректный ответ");
            answer = in.next();
        }

        if (answer.equals("n")) {
            System.out.println("До свидания!");
            return;
        }

        for (int i = 0; i < encryptedTextChars.length; i++) {
            textToEncryptChars[i] = (char) (encryptedTextChars[i] - key);
        }

        textToEncrypt = new String(textToEncryptChars);

        System.out.printf("Текст после обратного преобразования: %s", textToEncrypt);

        in.close();
    }
}
