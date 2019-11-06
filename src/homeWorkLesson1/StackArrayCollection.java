package homeWorkLesson1;

public class StackArrayCollection<E> extends ArrayCollection {
    public boolean push(E item) {
        return addLast(item);

    }

    public E pop() {
        E res = (E) list[count - 1];
        list[count - 1] = null;
        count--;
        return res;
    }

    public E peek() {
        return (E) list[count - 1];
    }

}
