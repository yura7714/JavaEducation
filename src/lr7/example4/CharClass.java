package lr7.example4;

public class CharClass {
    public char symbol;

    CharClass(char symbol) {
        this.symbol = symbol;
    }

    CharClass(CharClass charClass) {
        this(charClass.symbol);
    }
}
