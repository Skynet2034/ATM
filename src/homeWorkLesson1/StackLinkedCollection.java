package homeWorkLesson1;

public class StackLinkedCollection<E> extends LinkedCollection {

    public boolean push(E item) {
        return addFirst(item);
    }

    public E pop() {
        return (E) removeFirst();
    }

    public E peek() {
        return (E) head.value;
    }

}
