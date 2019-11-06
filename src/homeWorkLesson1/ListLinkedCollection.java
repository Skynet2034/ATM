package homeWorkLesson1;

public class ListLinkedCollection<E> extends LinkedCollection {

    public boolean add(E item) {
        return addLast(item);
    }

    public E remove(Object item) {
        return (E) super.remove(item);
    }

    public E remove(int index) {
        LinkedCollection<E>.Node<E> current = head;
        int i = 0;
        LinkedCollection<E>.Node<E> parent = head;
        while (current != null) {
            if (i == index) {
                parent.next = current.next;
                if (tail == current) tail = parent;
                return (E) current.value;
            }
            parent = current;
            current = current.next;
            i++;
        }
        return null;
    }

    public Object[] toArray() {
        ListArrayCollection<E> list = new ListArrayCollection<>();
        LinkedCollection<E>.Node<E> current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        return list.toArray();
    }
}
