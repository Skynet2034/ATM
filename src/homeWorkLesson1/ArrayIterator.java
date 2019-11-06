package homeWorkLesson1;

public class ArrayIterator<E> implements Iterator {
    ArrayCollection<E> collection;
    int index;

    ArrayIterator(ArrayCollection<E> collection) {
        this.collection = collection;
        index = -1;
    }

    public boolean hasNext() {
        return (index < collection.size() - 1) ? true : false;
    }

    public E next() {
        index++;
        if (index >= collection.size()) throw new RuntimeException("No next element");
        return collection.get(index);
    }

    public E remove() {
        E res = collection.remove(index);
        index--;
        return res;
    }
}
