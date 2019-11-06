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

    public Node<E> getHead() {
        return head;
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

    public String toString() //для вывода данных в классе CollectionsTest
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
    public E remove(E item)
    {
        Node<E>  current = head;
        Node<E> parent = head;
        while (current != null){
            if(current.value.equals(item)){
                if (current==head) return removeFirst();
                else {
                    parent.next = current.next;
                    if (tail == current) tail = parent;
                    return item;
                }
            }
            parent = current;
            current = current.next;
        }
        return null;
    }
    public Iterator<E> getIterator() {
        return new ListIterator<E>(this);
    }


   boolean addFirst(E item){
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

   void append(E item){
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

    boolean addLast(E item)
    {
        if (head==null)
            return addFirst(item);
        Node<E> tmp=new Node<>();
        tmp.value=item;
        tail.next=tmp;
        tail=tmp;
        return true;
    }


   E removeFirst(){
        if(head == null)
            throw new NoSuchElementException();
        Node<E> tmp = head;
        head = head.next;
        return tmp.value;
    }


    class Node<E>{
        E value;
        Node<E> next;
        public String toString()
        {
            return this.value.toString();
        }

    }
}


