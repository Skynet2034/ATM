package homeWorkLesson1;

import collection.impl.ListAtmCollection;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class CollectionsTest {

    public static void main(String[] args) {
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
  /*      ListCollectionList<Integer> linkedList = new ListCollectionList<>();
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
        System.out.println("List Iterator");
        ListCollectionList<Integer> linkedList = new ListCollectionList<>();
        for (int i=1;i<=10;i++)
            linkedList.add(i);
        Iterator it2=linkedList.getIterator();
        while(it2.hasNext())
        {
            System.out.println("next="+it2.next());
            System.out.println("remove="+it2.remove());}
        System.out.println(linkedList);
    }
}
