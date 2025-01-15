package lr5;

import java.util.Scanner;

class SymbolsSequence {
    char firstSymbol, lastSymbol;

    public void print() {
        if (firstSymbol > lastSymbol) {
            for (char i = firstSymbol; i >= lastSymbol; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = firstSymbol; i <= lastSymbol; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SymbolsSequence sequence = new SymbolsSequence();

        String input;

        do {
            System.out.println("Input first symbol:");
            input = in.next();
        } while (input.length() > 1);

        sequence.firstSymbol = input.charAt(0);

        do {
            System.out.println("Input second symbol:");
            input = in.next();
        } while (input.length() > 1);

        sequence.lastSymbol = input.charAt(0);
        sequence.print();

        in.close();
    }
}
