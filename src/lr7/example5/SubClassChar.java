package lr7.example5;

public class SubClassChar extends SuperClassString {
    protected char symbol;

    SubClassChar(String str, char symbol) {
        super(str);
        this.symbol = symbol;
    }

    @Override
    public void print() {
        System.out.println("Class: " + this.getClass().getSimpleName() + "\n" +
                "str: " + this.getStr() + "\n" +
                "char: " + this.symbol);
    }
}
