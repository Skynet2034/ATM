package homeWorkLesson1;

public class QueueLinkedCollection<E> extends LinkedCollection {

    public boolean add(E item) {
        return addLast(item);
    }

    public E poll() {
        return (E) removeFirst();
    }

    public E peek() {
        return (E) head.value;
    }
}
