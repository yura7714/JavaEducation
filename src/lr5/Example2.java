package lr5;

import java.util.Scanner;

class SymbolsSequence {
    char firstSymbol, lastSymbol;

    private void printChar(char c, StringBuilder stringBuilder) {
        String output = c + " ";

        System.out.print(output);
        stringBuilder.append(output);
    }

    public StringBuilder print() {
        StringBuilder output = new StringBuilder();

        if (firstSymbol > lastSymbol) {
            for (char i = firstSymbol; i >= lastSymbol; i--) {
                printChar(i, output);
            }
        } else {
            for (char i = firstSymbol; i <= lastSymbol; i++) {
                printChar(i, output);
            }
        }

        return output;
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
