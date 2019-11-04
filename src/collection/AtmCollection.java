package collection;

public interface AtmCollection<E> {
    void add(E item);
    void remove(E item);
    int size();
}
