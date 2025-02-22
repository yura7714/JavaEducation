package lr7.example4;

// 4.	Напишите программу, в которой использована цепочка наследования из трех классов. В первом классе есть открытое
// символьное поле. Во втором классе появляется открытое текстовое поле. В третьем классе появляется открытое
// целочисленное поле. В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений
// полей, переданных аргументами конструктору, а также конструктор создания копии.

public class Example4 {
    public static void main(String[] args) {
        CharClass charClass1 = new CharClass('Y');
        CharClass charClass2 = new CharClass(charClass1);
        System.out.println(charClass1.getClass().getSimpleName() + "\n" +
                "char1: " + charClass1.symbol + "\n" +
                "char2: " + charClass2.symbol);

        StringClass stringClass1 = new StringClass('A', "butterfly");
        StringClass stringClass2 = new StringClass(stringClass1);
        System.out.println(stringClass1.getClass().getSimpleName() + "\n" +
                "char1: " + stringClass1.symbol + "\n" +
                "string1: " + stringClass1.str + "\n" +
                "char2: " + stringClass2.symbol + "\n" +
                "string2: " + stringClass2.str);

        IntClass intClass1 = new IntClass('F', "medium rare", 543);
        IntClass intClass2 = new IntClass(intClass1);
        System.out.println(intClass1.getClass().getSimpleName() + "\n" +
                "char1: " + intClass1.symbol + "\n" +
                "string1: " + intClass1.str + "\n" +
                "integer1: " + intClass1.integer + "\n" +
                "char2: " + intClass2.symbol + "\n" +
                "string2: " + intClass2.str + "\n" +
                "integer2: " + intClass2.integer + "\n"
        );
    }
}
