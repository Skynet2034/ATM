package homeWorkLesson1;

public class ArrayCollectionQueue <E> extends ArrayCollection {

    public boolean add(E item)
    {
        return addFirst(item);
    }

    public E poll()
    {
        E res=(E) list[count-1];
        list[count-1]=null;
        count--;
        return res;
    }
    public E peek()
    {
        return (E) list[count-1];
    }

}
