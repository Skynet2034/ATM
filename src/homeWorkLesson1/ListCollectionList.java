package homeWorkLesson1;

public class ListCollectionList<E> extends ListCollection {

   public boolean add(E item)
   {
       return addLast(item);
   }
//remove по элементу реализован в суперклассе для коректной работы метода итератора remove
    public E remove(int index)
    {
        ListCollection<E>.Node<E>  current = head;
        int i=0;
        ListCollection<E>.Node<E>  parent = head;
        while (current != null){
            if(i==index){
                parent.next = current.next;
                if (tail==current) tail=parent;
                return (E) current.value;
            }
            parent = current;
            current = current.next;
            i++;
        }
        return null;
    }

    public Object[] toArray()
    {
        ArrayCollectionList<E> list=new ArrayCollectionList<>();
        ListCollection<E>.Node<E>  current = head;
           while (current != null){
            list.add(current.value);
            current=current.next;
           }
        return list.toArray();
    }
}
