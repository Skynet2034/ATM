package homeWorkLesson1;

public class ListCollectionQueue<E> extends ListCollection {

   public boolean add(E item)
   {
       return addLast(item);
   }
   public E poll()
   {
       return (E) removeFirst();
   }
public E peek()
{
    return (E) head.value;
}
}
