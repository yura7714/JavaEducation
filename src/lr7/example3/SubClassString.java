package lr7.example3;

public class SubClassString extends SubClassChar {
    public String str;

    public void setFields(int integer, char symbol, String string) {
        super.setFields(integer, symbol);
        this.str = string;
    }

    SubClassString(int integer, char symbol, String string) {
        setFields(integer, symbol, string);
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\n" +
                "integer: " + this.integer + "\n" +
                "symbol: " + this.symbol + "\n" +
                "str: " + this.str;
    }
}
