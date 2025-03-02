package lr9.example13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Benchmark {
    final static int VARIANT = 12;
    final static int COLLECTION_SIZE = VARIANT * 100000;
    final static int INDEX_SEARCH_COLLECTION_SIZE = VARIANT * 1000000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления в начало arrayList = " +
                getRunningTimeAddFirst(arrayList));

        System.out.println("Время выполнения операции добавления в начало treeMap = " +
                getRunningTimeAddFirst(treeMap));

        System.out.println("Время выполнения операции добавления в начало arrayDeque = " +
                getRunningTimeAddFirst(arrayDeque));

        System.out.println("Время выполнения операции добавления в середину arrayList = " +
                getRunningTimeAddMiddle(arrayList));

        System.out.println("Время выполнения операции добавления в середину treeMap = " +
                getRunningTimeAddMiddle(treeMap));

        System.out.println("Время выполнения операции добавления в конец arrayList = " +
                getRunningTimeAddLast(arrayList));

        System.out.println("Время выполнения операции добавления в конец treeMap = " +
                getRunningTimeAddLast(treeMap));

        System.out.println("Время выполнения операции добавления в конец arrayDeque = " +
                getRunningTimeAddLast(arrayDeque));

        System.out.println("Время выполнения операции удаления в начале arrayList = " +
                getRunningTimeRemoveFirst(arrayList));

        System.out.println("Время выполнения операции удаления в начале treeMap = " +
                getRunningTimeRemoveFirst(treeMap));

        System.out.println("Время выполнения операции удаления в начале arrayDeque = " +
                getRunningTimeRemoveFirst(arrayDeque));

        System.out.println("Время выполнения операции удаления в середине arrayList = " +
                getRunningTimeRemoveMiddle(arrayList));

        System.out.println("Время выполнения операции удаления в середине treeMap = " +
                getRunningTimeRemoveMiddle(treeMap));

        System.out.println("Время выполнения операции удаления в конце arrayList = " +
                getRunningTimeRemoveLast(arrayList));

        System.out.println("Время выполнения операции удаления в конце treeMap = " +
                getRunningTimeRemoveLast(treeMap));

        System.out.println("Время выполнения операции удаления в конце arrayDeque = " +
                getRunningTimeRemoveLast(arrayDeque));

        System.out.println("Время выполнения операции получения по индексу arrayList = " +
                getRunningTimeAccessIndex(arrayList));

        System.out.println("Время выполнения операции получения по индексу treeMap = " +
                getRunningTimeAccessIndex(treeMap));
    }

    private static long getRunningTimeAddFirst(ArrayList<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.addFirst(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddFirst(ArrayDeque<Integer> arrayDeque) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            arrayDeque.addFirst(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddFirst(TreeMap<Integer, Integer> treeMap) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = COLLECTION_SIZE; i > 0; i--) {
            treeMap.put(i, i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddMiddle(ArrayList<Integer> list) {
        // сначала заполним ArrayList, чтобы затем вставлять значения в случайные индексы
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.addLast(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        Random random = new Random();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.add(random.nextInt(COLLECTION_SIZE), i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddMiddle(TreeMap<Integer, Integer> treeMap) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        Random random = new Random();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            treeMap.put(random.nextInt(COLLECTION_SIZE), i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddLast(ArrayList<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.addLast(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddLast(ArrayDeque<Integer> arrayDeque) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            arrayDeque.addLast(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddLast(TreeMap<Integer, Integer> treeMap) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            treeMap.put(i, i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(ArrayList<Integer> list) {
        // сначала заполним коллекцию, чтобы было что удалять
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.addLast(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.removeFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(ArrayDeque<Integer> arrayDeque) {
        // сначала заполним коллекцию, чтобы было что удалять
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            arrayDeque.addLast(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            arrayDeque.removeFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(TreeMap<Integer, Integer> treeMap) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            treeMap.put(i, i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            treeMap.remove(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(ArrayList<Integer> list) {
        // сначала заполним коллекцию, чтобы было что удалять
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.addLast(i);
        }

        Random random = new Random();

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.remove(random.nextInt(list.size()));
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(TreeMap<Integer, Integer> treeMap) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            treeMap.put(i, i);
        }

        Random random = new Random();

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            treeMap.remove(random.nextInt(COLLECTION_SIZE));
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(ArrayList<Integer> list) {
        // сначала заполним коллекцию, чтобы было что удалять
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.addLast(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.removeLast();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(ArrayDeque<Integer> arrayDeque) {
        // сначала заполним коллекцию, чтобы было что удалять
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            arrayDeque.addLast(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            arrayDeque.removeLast();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(TreeMap<Integer, Integer> treeMap) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            treeMap.put(i, i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = COLLECTION_SIZE - 1; i > 0; i--) {
            treeMap.remove(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAccessIndex(ArrayList<Integer> list) {
        // сначала заполним коллекцию, чтобы было что получать
        for (int i = 0; i < INDEX_SEARCH_COLLECTION_SIZE; i++) {
            list.addLast(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < INDEX_SEARCH_COLLECTION_SIZE; i++) {
            list.get(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAccessIndex(TreeMap<Integer, Integer> treeMap) {
        for (int i = 0; i < INDEX_SEARCH_COLLECTION_SIZE; i++) {
            treeMap.put(i, i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция удаления
        for (int i = 0; i < INDEX_SEARCH_COLLECTION_SIZE; i++) {
            treeMap.get(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}
