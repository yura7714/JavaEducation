package lr5;

import java.util.Scanner;

class Symbol {
    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getSymbolCode() {
        return symbol;
    }

    public void printSymbolInfo() {
        System.out.printf("Symbol: %s, code: %d", this.symbol, getSymbolCode());
    }
}

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Symbol symbol = new Symbol();

        String input;

        do {
            System.out.println("Input one symbol:");
            input = in.next();
        } while (input.length() > 1);

        symbol.setSymbol(input.charAt(0));
        symbol.printSymbolInfo();
        in.close();
    }
}
