package lr7.example4;

public class IntClass extends StringClass {
    public int integer;

    IntClass(char symbol, String str, int integer) {
        super(symbol, str);
        this.integer = integer;
    }

    IntClass(IntClass intClass) {
        this(intClass.symbol, intClass.str, intClass.integer);
    }
}
