package homeWorkLesson1;

public class ListCollectionStack<E> extends ListCollection {
// метод push и pop реализованы в суперклассе
    public E peek()
    {
                return (E) head.value;
    }

}
