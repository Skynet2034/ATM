import java.util.Objects;

public class HashMapCustom {
    private Object[] data=new Object[100];

    public void put(Object key, Object value){
        int hash= Objects.hash(key);
    }
    public Object get()
    {
       return null;
    }
}
