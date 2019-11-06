package homeWorkLesson1;

public class ListIterator<E> implements Iterator {
    ListCollection<E> collection;
    ListCollection<E>.Node<E> current;
    ListIterator(ListCollection<E> collection)
    {
       this.collection=collection;
       current=collection.getHead();
    }
   public boolean hasNext()
    {
        return (current!=null);
    }
    public E next()
    {
        if (current==null) throw new RuntimeException("No next element");
        E res=current.value;
        current=current.next;
        return res;
    }

    public E remove()
    {
        if (current==null) throw new RuntimeException("No next element");
        E res=current.value;
        current=current.next;
        return collection.remove(res);
          }
}
