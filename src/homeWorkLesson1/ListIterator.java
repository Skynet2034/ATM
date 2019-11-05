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
        return current.next!=null;
    }
    public E next()
    {
        E res=current.value;
        current=current.next;
        return res;
    }

    public E remove()
    {
        ListCollection<E>.Node<E> tmp=current.next;
        E res=current.value;
        current=current.next;
        return collection.remove(res);
          }
}
