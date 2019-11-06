package homeWorkLesson1;

import collection.impl.ListAtmCollection;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class CollectionsTest {
public static void benchmark(int length)
{
   // Random rand=new Random();
    ListArrayCollection<Integer> arr=new ListArrayCollection<>();
    ListLinkedCollection<Integer> linked=new ListLinkedCollection<>();
    for (int i=0;i<length;i++)
    {
      //  int value=rand.nextInt(100);
        arr.add(i);
        linked.add(i);
          }

    System.out.println("Array - добавление 1000 элементов в конец");
    long startTime=System.currentTimeMillis();
    for (int i=0; i<1000; i++)
        arr.add(i);
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("Array - добавление 1000 элементов в начало");
    startTime=System.currentTimeMillis();
    for (int i=0; i<1000; i++)
        arr.addFirst(i);
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("LinkedList - добавление 1000 элементов в конец");
    startTime=System.currentTimeMillis();
    for (int i=0; i<1000; i++)
        linked.add(i);
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("LinkedList - добавление 1000 элементов в начало");
    startTime=System.currentTimeMillis();
      for (int i=0; i<1000; i++)
        linked.addFirst(i);
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("Array - поиск 5000 элементов в середине по значению (с 1000 по 6000)");
    startTime=System.currentTimeMillis();
    for (int i=1000; i<6000; i++)
        arr.contains(Integer.valueOf(i));
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("Array - поиск 5000 элементов в середине по индексу (с 1000 по 6000)");
        startTime=System.currentTimeMillis();
    for (int i=1000; i<6000; i++)
        arr.get(i);
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("LinkedList - поиск 5000 элементов в середине (с 1000 по 6000)");
    startTime=System.currentTimeMillis();
    for (int i=1000; i<6000; i++)
        linked.contains(i);
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("Array - удаление 5000 элементов в начале");
    startTime=System.currentTimeMillis();
    Iterator it=arr.getIterator();
    for (int i=0; i<5000; i++)
        it.remove();
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));

    System.out.println("LinkedList - удаление 5000 элементов в начале");
    startTime=System.currentTimeMillis();
    Iterator it2=linked.getIterator();
    for (int i=0; i<5000; i++)
        it2.remove();
    System.out.println("Время - "+(System.currentTimeMillis()-startTime));
}
    public static void main(String[] args) {
    benchmark(10000);
       /* //ArrayColectionQueue and general ArrayCollection tests
       ArrayCollectionQueue<Integer> queue = new ArrayCollectionQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("ArrayColectionQueue and general ArrayCollection tests");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.contains(2));
        System.out.println(queue.contains("2"));
        queue.clear();
        System.out.println(queue.isEmpty());

        //ArrayColectionStack tests
        ArrayCollectionStack<Integer> stack = new ArrayCollectionStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("ArrayColectionStack tests");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());

        //ArrayColectionList tests
        ArrayCollectionList<Integer> list = new ArrayCollectionList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        System.out.println("ArrayColectionList tests");
        System.out.println(list);
        System.out.println("toArray="+ Arrays.toString(list.toArray()));
        System.out.println(list.remove(Integer.valueOf(1)));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);*/
       //ListCollection general tests
 /*       ListCollection<Integer> linkList = new ListCollection<>();
        for (int i=1;i<=10;i++)
        list.push(i);
        System.out.println(linkList);
        list.addTail(12);
        System.out.println(linkList);
        list.append(11);
        System.out.println("ListCollection general tests");
        System.out.println(linkList);
        System.out.println(linkList.contains(10));
        System.out.println(linkList.contains("10"));
        System.out.println(linkList.isEmpty());
        linkList.clear();
        System.out.println(linkList);
        System.out.println(linkList.isEmpty());*/

        //ListCollectionStack tests
      /* ListCollectionStack<Integer> linkStack = new ListCollectionStack<>();
        for (int i=1;i<=10;i++)
            linkStack.push(i);
        System.out.println("ListCollectionStack tests");
        System.out.println(linkStack);
        System.out.println(linkStack.pop());
        System.out.println(linkStack);
        System.out.println(linkStack.peek());
*/
        //ListCollectionQueue tests
      /*  ListCollectionQueue<Integer> linkQueue = new ListCollectionQueue<>();
        for (int i=1;i<=2;i++)
            linkQueue.add(i);
        System.out.println("ListCollectionQueue tests");
        System.out.println(linkQueue);
        System.out.println(linkQueue.poll());
        System.out.println(linkQueue);
        System.out.println(linkQueue.peek());

        //ListCollectionList tests*/
  /*     ListCollectionList<Integer> linkedList = new ListCollectionList<>();
        for (int i=1;i<=10;i++)
            linkedList.add(i);
        System.out.println("ListCollectionList tests");
        System.out.println(linkedList);
        System.out.println(linkedList.remove(Integer.valueOf(10)));
        System.out.println(linkedList);
        System.out.println(linkedList.remove(7));
        System.out.println(linkedList);
        linkedList.add(0);
        System.out.println("toArray="+ Arrays.toString(linkedList.toArray()));*/
 /*       System.out.println("Array Iterator");
        ArrayCollectionList<Integer> list = new ArrayCollectionList<>();
        for (int i=1;i<=10;i++)
            list.add(i);
        Iterator it=list.getIterator();
                while(it.hasNext())
                {
                    System.out.println(it.next());
                it.remove();}
        System.out.println(list);*/
   /*     System.out.println("List Iterator");
        ListCollectionList<Integer> linkedList = new ListCollectionList<>();
        for (int i=1;i<=10;i++)
            linkedList.add(i);
        Iterator it2=linkedList.getIterator();
        System.out.println(linkedList);
        while(it2.hasNext())
        {
            //System.out.println("next="+it2.next());}
           System.out.println("remove="+it2.remove());
            System.out.println(linkedList);}
        System.out.println(linkedList);*/
    }
}
