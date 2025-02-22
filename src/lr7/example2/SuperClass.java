package lr7.example2;

public class SuperClass {
    private String str1;

    SuperClass(String string) {
        setFields(string);
    }

    public String getStr1() {
        return str1;
    }

    public void setFields(String string) {
        this.str1 = string;
    }

    public int getStr1Length() {
        return getStr1().length();
    }
}
