package lr7.example5;

public class SuperClassString {
    private String str;

    public String getStr() {
        return this.str;
    }

    SuperClassString(String str) {
        this.str = str;
    }

    public void print() {
        System.out.println("Class: " + this.getClass().getSimpleName() + "\n" +
                "str: " + getStr());
    }
}
