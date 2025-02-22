package lr7.example1;

public class SubClass extends SuperClass {
    private String str2;

    public String getStr2() {
        return str2;
    }

    public void setStr2(String string) {
        str2 = string;
    }

    SubClass(String string) {
        super(string);
        setStr2(string);
    }

    SubClass(String strEx1, String strEx2) {
        super(strEx1);
        setStr2(strEx2);
    }

    @Override
    public String toString() {
        String classNameAndFieldsValues;
        classNameAndFieldsValues = "Class name: " + this.getClass().getSimpleName() + "\n"
                + "str1: " + this.getStr1() + "\n"
                + "str2: " + this.getStr2();
        return classNameAndFieldsValues;
    }
}
