package homeWorkLesson1;

public class ArrayCollectionQueue <E> extends ArrayCollection {

    public boolean add(E item)
    {
        if(count == list.length)
            expand();
        System.arraycopy(list,0, list,1, count);
        list[0]=item;
        count++;
        return true;
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
