package homeWorkLesson1;

public class ListCollectionQueue<E> extends ListCollection {
// метод push и pop реализованы в суперклассе
   public boolean add(E item)
   {
       return addTail(item);
   }
   public E poll()
   {
       return (E) pop();
   }
public E peek()
{
    return (E) head.value;
}
}
