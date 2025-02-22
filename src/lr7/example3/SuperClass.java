package lr7.example3;

public class SuperClass {
    public int integer;

    public SuperClass() {
    }

    public void setFields(int integer) {
        this.integer = integer;
    }

    SuperClass(int integer) {
        setFields(integer);
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\n" +
                "integer: " + this.integer;
    }
}
