package lr9.example12;

import java.util.Scanner;

class Node {
    String value;
    Node next;

    Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class SinglyLinkedList {
    private final int size;
    private Node head, tail;

    SinglyLinkedList(int size) {
        this.size = size;
    }

    public void createHead() {
        Scanner in = new Scanner(System.in);
        Node prevNode = null, newNode;

        for (int i = 0; i < size; i++) {
            System.out.printf("Input value of %d-th node: ", i);
            String value = in.nextLine();

            newNode = new Node(value, null);

            if (i == 0) {
                head = newNode;
            } else {
                prevNode.next = newNode;
            }

            prevNode = newNode;
        }

        tail = prevNode;
    }

    public void createTail() {
        Scanner in = new Scanner(System.in);

        Node newNode, nextNode = null;

        for (int i = size - 1; i >= 0; i--) {
            System.out.printf("Input value of %d-th node: ", i);
            String value = in.nextLine();

            newNode = new Node(value, nextNode);

            if (i == size - 1) {
                tail = newNode;
            }

            nextNode = newNode;
        }

        head = nextNode;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            result.append(ref.value).append(ref.next == null ? "" : ", ");
            ref = ref.next;
        }

        return String.valueOf(result);
    }

    public void AddFirst(String value) {
        head = new Node(value, head);
    }

    public void AddLast(String value) {
        tail.next = new Node(value, null);
        tail = tail.next;
    }

    public void Insert(int index, String value) {
        if (index < 0) {
            System.out.println("Index must be greater or equal 0!");
            return;
        } else if (index == 0) {
            AddFirst(value);
            return;
        }

        Node ref = head;
        for (int i = 0; i < index - 1; i++) {
            if (ref.next == null) {
                ref.next = new Node("", null);
            }

            ref = ref.next;
        }

        ref.next = new Node(value, ref.next);

        while (ref.next != null) {
            ref = ref.next;
        }

        tail = ref;
    }

    public void RemoveFirst() {
        head = head.next;
    }

    public void RemoveLast() {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next = null;
        tail = ref;
    }

    public void Remove(int index) {
        if (index < 0) {
            System.out.println("Index must be greater or equal 0!");
            return;
        } else if (index == 0) {
            RemoveFirst();
            return;
        }

        Node ref = head;
        for (int i = 0; i < index - 1; i++) {
            if (ref.next == null) {
                System.out.println("No node with provided index!");
                return;
            }

            ref = ref.next;
        }

        ref.next = ref.next.next;

        while (ref.next != null) {
            ref = ref.next;
        }

        tail = ref;
    }

    public void createHeadRec() {
        createHeadRec(size - 1);
    }

    private Node createHeadRec(int n) {
        Node prevNode = null;
        if (n > 0) {
            prevNode = createHeadRec(n - 1);
        }

        Scanner in = new Scanner(System.in);

        System.out.printf("Input value of %d-th node: ", n);
        String value = in.nextLine();

        Node newNode = new Node(value, null);

        tail = newNode;

        if (prevNode != null) {
            prevNode.next = newNode;
        } else {
            head = newNode;
        }
        return newNode;
    }

    public void createTailRec() {
        createTailRec(0);
    }

    private Node createTailRec(int n) {
        Node nextNode = null;

        if (n < size - 1) {
            nextNode = createTailRec(n + 1);
        }

        Scanner in = new Scanner(System.in);
        System.out.printf("Input value of %d-th node: ", n);
        String value = in.nextLine();

        Node newNode = new Node(value, nextNode);

        if (n == size - 1) {
            tail = newNode;
        } else if (n == 0) {
            head = newNode;
        }

        return newNode;
    }

    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node node) {
        if (node.next == null) {
            return node.value;
        }

        return node.value + ", " + toStringRec(node.next);
    }
}

public class Example12 {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(5);

        sll.createHead();
        System.out.println("createHead():");
        System.out.println(sll);

        sll.createTail();
        System.out.println("createTail():");
        System.out.println(sll);

        sll.AddFirst("first");
        System.out.println("AddFirst():");
        System.out.println(sll);

        sll.AddLast("last");
        System.out.println("AddLast():");
        System.out.println(sll);

        sll.Insert(10, "insert");
        System.out.println("Insert(10):");
        System.out.println(sll);

        sll.RemoveFirst();
        System.out.println("RemoveFirst():");
        System.out.println(sll);

        sll.RemoveLast();
        System.out.println("RemoveLast():");
        System.out.println(sll);

        sll.Remove(3);
        System.out.println("Remove(3):");
        System.out.println(sll);

        SinglyLinkedList sllRec = new SinglyLinkedList(5);
        sllRec.createHeadRec();
        System.out.println("createHeadRec()");
        System.out.println(sllRec);

        sllRec.createTailRec();
        System.out.println("createTailRec() + toStringRec()");
        System.out.println(sllRec.toStringRec());
    }
}
