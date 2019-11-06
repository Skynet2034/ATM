package homeWorkLesson1;

public class CollectionsTest {
    public static void benchmark(int length) {
        ListArrayCollection<Integer> arr = new ListArrayCollection<>();
        ListLinkedCollection<Integer> linked = new ListLinkedCollection<>();
        for (int i = 0; i < length; i++) {

            arr.add(i);
            linked.add(i);
        }

        System.out.println("Array - добавление 1000 элементов в конец");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            arr.add(i);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("Array - добавление 1000 элементов в начало");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            arr.addFirst(i);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("LinkedList - добавление 1000 элементов в конец");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            linked.add(i);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("LinkedList - добавление 1000 элементов в начало");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            linked.addFirst(i);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("Array - поиск 5000 элементов в середине по значению (с 1000 по 6000)");
        startTime = System.currentTimeMillis();
        for (int i = 1000; i < 6000; i++)
            arr.contains(Integer.valueOf(i));
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("Array - поиск 5000 элементов в середине по индексу (с 1000 по 6000)");
        startTime = System.currentTimeMillis();
        for (int i = 1000; i < 6000; i++)
            arr.get(i);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("LinkedList - поиск 5000 элементов в середине (с 1000 по 6000)");
        startTime = System.currentTimeMillis();
        for (int i = 1000; i < 6000; i++)
            linked.contains(i);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("Array - удаление 5000 элементов в начале");
        startTime = System.currentTimeMillis();
        Iterator it = arr.getIterator();
        for (int i = 0; i < 5000; i++)
            it.remove();
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("LinkedList - удаление 5000 элементов в начале");
        startTime = System.currentTimeMillis();
        Iterator it2 = linked.getIterator();
        for (int i = 0; i < 5000; i++)
            it2.remove();
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));
    }

    public static void main(String[] args) {
        benchmark(10000);
    }
}
