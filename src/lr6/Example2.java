package lr6;

import java.util.Random;

class StaticField {
    private static int value = 0;

    public static void showAndUpdateValue() {
        System.out.println("Value is " + value++);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(1,6); i++) {
            StaticField.showAndUpdateValue();
        }
    }
}
