package lr7.example2;

public class SubClass extends SuperClass {
    public int integer;
    SubClass(String str, int integer) {
        super(str);
        setFields(integer);
    }

    @Override
    public void setFields(String string) {
        super.setFields(string);
        this.integer = this.getStr1Length();
    }

    public void setFields() {
        super.setFields("метод без параметров");
        this.integer = this.getStr1Length();
    }

    public void setFields(int integer) {
        if (super.getStr1().isEmpty()) {
            super.setFields("метод с целочисленным параметром");
        }
        this.integer = integer;
    }

    public void setFields(String string, int integer) {
        super.setFields(string);
        this.integer = integer;
    }
}

