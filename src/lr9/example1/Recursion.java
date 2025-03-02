package lr9.example1;

public class Recursion {
    public static void m(int x) {
        System.out.println("x=" + x);
        int next_value = 2 * x + 1;
        if (next_value < 20) {
            m(next_value);
        }
    }

    public static void main(String[] args) {
        m(0);
    }
}
