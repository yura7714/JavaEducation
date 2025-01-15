package lr6;

import java.util.Random;
import java.util.Scanner;

class SymbolAndText {
    private char symbol;
    private String text;

    public void setValue(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(char[] symbols) {
        if (symbols.length == 1) {
            this.symbol = symbols[0];
            return;
        }

        text = new String(symbols);
    }

    public void setValue(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("symbol = " + this.symbol);
        System.out.println("text = " + this.text);
    }
}

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        SymbolAndText symbolAndText = new SymbolAndText();
        final int FIRST_SYMBOL_CODE = 65, LAST_SYMBOL_CODE = 90;

        System.out.println("Set symbol");
        char symbol = (char)random.nextInt(FIRST_SYMBOL_CODE, LAST_SYMBOL_CODE);
        symbolAndText.setValue(symbol);
        symbolAndText.print();

        System.out.println("Set array of symbols (>1 elements)");
        char[] symbols = new char[3];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = (char)random.nextInt(FIRST_SYMBOL_CODE, LAST_SYMBOL_CODE);
        }
        symbolAndText.setValue(symbols);
        symbolAndText.print();

        System.out.println("Set array of symbol (1 element)");
        char[] oneSymbol = new char[1];
        oneSymbol[0] = (char)random.nextInt(FIRST_SYMBOL_CODE, LAST_SYMBOL_CODE);
        symbolAndText.setValue(oneSymbol);
        symbolAndText.print();

        System.out.println("Set text");
        String text = "Some interesting text";
        symbolAndText.setValue(text);
        symbolAndText.print();

        in.close();
    }
}
