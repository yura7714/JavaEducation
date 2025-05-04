package lr12;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            int finalI = i;
            Thread t = new Thread(() -> System.out.println("Thread " + finalI));

            t.start();
            t.join();
        }
    }
}
