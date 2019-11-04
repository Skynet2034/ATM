package homeWorkLesson1;

import collection.AtmCollection;

public class ArrayCollection<E> {

    E[] list;
    int count;

    public ArrayCollection(){
        this(10);
    }

    public ArrayCollection(int capacity){
        list = (E[]) new Object[capacity];
    }


    public boolean addLast(E item) {
        if(count == list.length){
            expand();
        }
        list[count] = item;
        count++;
        return true;
    }

    public E get(int idx){
        checkIndex(idx);
        return list[idx];
    }

    protected void checkIndex(int index) {
        if(index > this.count || index < 0){
            throw new RuntimeException("index out of range");
        }
    }

    protected void expand(){
        E tmp[] = (E[])new Object[count*2+1];
        System.arraycopy(list,0,tmp,0,count);
        list = tmp;
    }

    public int size() {
        return count;
    }

    //методы contains(Object element), isEmpty(), clear() - общие для стека, очереди и списка, реализуем их в суперклассе
    public boolean isEmpty()
    {
        return (count==0)?true:false;
    }

    public void clear()
    {
        list = (E[]) new Object[10];//default capacity
        count=0;
    }
    public boolean contains(Object element)
    {
        if (isEmpty()) return false;
        if (element!=null && (element.getClass()==list[0].getClass())) {
            for (int i=0;i<count;i++) { //если использовать foreach - проверяться будут также и null значения в list
                if (list[i].equals(element))
                    return true;
            }
        }
        return false;
    }

    public String toString() //для вывода даных в классе TestCollections
    {
       ;
        StringBuilder res=new StringBuilder("[");
        if (isEmpty()) return "null";
        int i=0;
        while (list[i]!=null &&i<list.length) {
            res.append(list[i]+" , ");
            i++;}
        return res.substring(0, res.length()-2)+"]";
    }
}
