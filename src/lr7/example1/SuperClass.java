package lr7.example1;

public class SuperClass {
    private String str1;

    SuperClass(String string) {
        setStr1(string);
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n"
                + "str1: " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String string) {
        this.str1 = string;
    }
}
