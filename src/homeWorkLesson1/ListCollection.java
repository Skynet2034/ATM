package homeWorkLesson1;

import java.util.NoSuchElementException;

/**
 * Добавить метод addLast, добавить поле IntegerNode tail и
 * реализовать метод добавление в хвост
 * Сравнить время
 * работы основных алгоритмов (добавление, удаление, получения)
 * связанного списка и коллекции на основе массива.
 */

public class ListCollection<E> {
    Node<E> head;
    Node<E> tail;

 public ListCollection(){
head=null;
tail=null;
    }
public boolean isEmpty() {
    return head==null ? true : false;
}
public void clear()
{
    head=null;
    tail=null;
}
    public boolean push(E item){
        if (head == null){
            head = new Node<>();
            head.value = item;
            tail=head;
             }
        else {
            Node<E> tmp = head;
            if (tail==head) tail=tmp;
            head = new Node<>();
            head.value = item;
            head.next = tmp;

        }
        return true;
    }

    public void append(E item){
        if (head == null){
            head = new Node<>();
            head.value = item;
            tail=head;
        }else{
            Node<E> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node<>();
            current.next.value = item;
            tail=current;
        }
    }
    public boolean addTail(E item)
    {
        if (head==null)
            return push(item);

        Node<E> tmp=tail;
        tail=new Node<>();
        tail.value=item;
        tmp.next=tail;
        return true;
    }


    public E pop(){
        if(head == null)
            throw new NoSuchElementException();
        Node<E> tmp = head;
        head = head.next;
        return tmp.value;
    }

    public boolean contains(Object element)
    {
        if (isEmpty()) return false;
        if (element!=null && (element.getClass()==head.value.getClass())) {
            Node<E>  current = head;
            while (current != null){
                   if (current.value.equals(element))
                    return true;
            }
        }
        return false;
    }

    class Node<E>{
        E value;
        Node<E> next;
        public String toString()
        {
            return this.value.toString();
        }

    }

    public String toString() //для вывода даных в классе TestCollections
    {
         StringBuilder res=new StringBuilder("[");
        if (isEmpty()) return "null";
        Node<E> current=head;
        while (current!=null) {
            res.append(current.value + " , ");
            current=current.next;
        }
        return res.substring(0, res.length()-2)+"]";
    }
}


