package lr9.example10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Node {
    String value;
    Node next;

    Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();

        HashMap<Integer, String> stringHashMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            stringHashMap.put(i, "str" + random.nextInt(150));
        }
        System.out.println("HashMap:");
        System.out.println(stringHashMap);

        int keysProduct = 1;

        Node head = null;
        for (Map.Entry<Integer, String> entry : stringHashMap.entrySet()) {
            Integer entryKey = entry.getKey();
            String entryValue = entry.getValue();

            if (entryKey > 5) {
                head = new Node(entryValue, head);
            }

            if (entryValue.length() > 5) {
                keysProduct *= entryKey;
            }
        }

        if (stringHashMap.containsKey(0)) {
            Node ref = head;

            if (ref == null) {
                System.out.println("There is no keys bigger than 5");
            } else {
                System.out.println("Strings with keys bigger than 5:");
                while (ref != null) {
                    System.out.print(ref.value + (ref.next == null ? "\n" : ", "));
                    ref = ref.next;
                }
            }
        }

        System.out.println("Product of keys with strings longer than 5: " + keysProduct);
    }
}
