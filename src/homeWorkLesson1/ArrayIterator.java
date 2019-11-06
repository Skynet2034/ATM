package homeWorkLesson1;

public class ArrayIterator<E> implements Iterator {
    ArrayCollection<E> collection;
    int index;

    ArrayIterator(ArrayCollection<E> collection) {
        this.collection = collection;
        index=0;
    }

    public boolean hasNext() {
        return (index < collection.size() - 1) ? true : false;
    }

    public E next() {
        if (index >= collection.size()) throw new RuntimeException("No next element");
        E res=(E) collection.get(index);
        index++;
        return res;
    }

    public E remove() {
        E res = collection.remove(index);
        index--;
        if (index<0) index=0;
        return res;
    }
}
