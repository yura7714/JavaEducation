package lr7.example2;
// 2.	Напишите программу, в которой есть суперкласс с приватным текстовым полем. В базовом классе (суперклассе) должен
// быть метод для присваивания значения полю с текстовым параметром. Объект суперкласса создается передачей одного
// текстового аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки. На основе суперкласса
// создается подкласс. В подклассе появляется дополнительное открытое (публичное) целочисленное поле. В классе должны
// быть такие версии метода для присваивания значений полям (используется переопределение и перегрузка метода из
// суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с текстовым и целочисленным
// параметром. У конструктора подкласса два параметра (целочисленный и текстовый).

public class Example2 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("передал в конструктор суперкласса");
        System.out.println("str1: " + superClass.getStr1());

        SubClass subClass = new SubClass("передал в конструктор подкласса", 52);
        System.out.println("str1: " + subClass.getStr1() + "\n" + "integer: " + subClass.integer);
    }
}
