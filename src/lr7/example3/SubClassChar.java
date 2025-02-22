package lr7.example3;

public class SubClassChar extends SuperClass {
    public char symbol;

    public SubClassChar() {
    }

    public void setFields(int integer, char symbol) {
        super.setFields(integer);
        this.symbol = symbol;
    }

    SubClassChar(int integer, char symbol) {
        setFields(integer, symbol);
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\n" +
                "integer: " + this.integer + "\n" +
                "symbol: " + this.symbol;
    }
}
