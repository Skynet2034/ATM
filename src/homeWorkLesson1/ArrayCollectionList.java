package homeWorkLesson1;

public class ArrayCollectionList<E> extends ArrayCollection {

public boolean add (E item)
{
    return addLast(item);
}
public E remove(E element) {

    if (element != null){

        for (int i=0;i<count;i++) { //если использовать foreach - проверяться будут также и null значения в list
            if (list[i].equals(element)){
                System.arraycopy(list,i+1,list,i,list.length-i-1);
                count--;
                return element;
            }

        }
    }
    return null;
}
    public E remove(int index) {
        checkIndex(index);
        E res = (E) list[index];
        System.arraycopy(list, index+1, list, index, list.length - index-1);
        count--;
        return res;
    }
    public Object[] toArray()
    {
        Object[] res=new Object[count];
        System.arraycopy(list, 0, res, 0, count);
        return res;
    }
}
