package lr6;

import java.util.Arrays;
import java.util.Random;

class CharArray {
    public static int[] getSymbolsCodes(char[] symbols) {
        int[] symbolsCodes = new int[symbols.length];

        for (int i = 0; i < symbols.length; i++) {
            symbolsCodes[i] = symbols[i];
        }

        return symbolsCodes;
    }
}

public class Example7 {
    public static void main(String[] args) {
        Random random = new Random();

        final int FIRST_SYMBOL_CODE = 65, LAST_SYMBOL_CODE = 90;

        char[] symbols = new char[random.nextInt(1, 10)];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = (char)random.nextInt(FIRST_SYMBOL_CODE, LAST_SYMBOL_CODE);
        }
        System.out.println("Array of symbols:");
        System.out.println(Arrays.toString(symbols));

        System.out.println("Array of symbols codes:");
        System.out.println(Arrays.toString(CharArray.getSymbolsCodes(symbols)));
    }
}
