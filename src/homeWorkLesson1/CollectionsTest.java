package homeWorkLesson1;

public class CollectionsTest {
    public static <E> void  benchmark (E[] testData) {
        ListArrayCollection<E> arr = new ListArrayCollection<>();
        ListLinkedCollection<E> linked = new ListLinkedCollection<>();
        /*for (int i = 0; i < testData.length; i++) {
            arr.add(i);
            linked.add(i);
        }*/

        System.out.println("Array - добавление " +testData.length+" элементов в конец");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testData.length; i++)
            arr.add(testData[i]);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));
        arr.clear();
        System.out.println("Array - добавление " +testData.length+" элементов в начало");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < testData.length; i++)
            arr.addFirst(testData[i]);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));


        System.out.println("LinkedList - добавление " +testData.length+" элементов в конец");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < testData.length; i++)
            linked.add(testData[i]);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

int start=testData.length/5;
        int finish=testData.length-start;

        System.out.println("Array - поиск "+(finish-start)+" элементов в середине по значению (с "+start+" по "+finish+")");
        startTime = System.currentTimeMillis();
        for (int i = start; i < finish; i++)
            arr.contains(testData[i]);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("Array - поиск "+(finish-start)+" элементов в середине по индексу (с "+start+" по "+finish+")");
        startTime = System.currentTimeMillis();
        for (int i = start; i < finish; i++)
            arr.get(i);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("LinkedList - поиск "+(finish-start)+" элементов в середине (с "+start+" по "+finish+")");
        startTime = System.currentTimeMillis();
        for (int i = start; i < finish; i++)
            linked.contains(testData[i]);
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("Array - удаление "+testData.length/2+" элементов в начале");
        startTime = System.currentTimeMillis();
        Iterator it = arr.getIterator();
        for (int i = 0; i < testData.length/2; i++)
            it.remove();
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));

        System.out.println("LinkedList - удаление "+testData.length/2+"  элементов в начале");
        startTime = System.currentTimeMillis();
        Iterator it2 = linked.getIterator();
        for (int i = 0; i < testData.length/2; i++)
            it2.remove();
        System.out.println("Время - " + (System.currentTimeMillis() - startTime));
    }

    public static void main(String[] args) {
        Integer[] testData=new Integer[100000];
        for (int i=0;i<testData.length;i++)
        {
            testData[i]=Integer.valueOf(i);
        }
        benchmark(testData);
    }
}
