package lr7.example4;

public class StringClass extends CharClass {
    public String str;

    StringClass(char symbol, String str) {
        super(symbol);
        this.str = str;
    }

    StringClass(StringClass stringClass) {
        this(stringClass.symbol, stringClass.str);
    }
}
