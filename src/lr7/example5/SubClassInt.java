package lr7.example5;

public class SubClassInt extends SuperClassString {
    protected int integer;

    SubClassInt(String str, int integer) {
        super(str);
        this.integer = integer;
    }

    @Override
    public void print() {
        System.out.println("Class: " + this.getClass().getSimpleName() + "\n" +
                "str: " + this.getStr() + "\n" +
                "integer: " + this.integer);
    }
}
