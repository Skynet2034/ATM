package collection.impl;

import collection.AtmCollection;

public class ArrayAtmCollection<E> implements AtmCollection<E> {

    E[] list;
    int count;

    public ArrayAtmCollection(){
        this(10);
    }

    public ArrayAtmCollection(int capacity){
        list = (E[]) new Object[capacity];
    }

    @Override
    public void add(E item) {
        if(count == list.length){
            expand();
        }
        list[count] = item;
        count++;
    }

    public E get(int idx){
        checkIndex(idx);
        return list[idx];
    }

    private void checkIndex(int index) {
        if(index > this.count || index < 0){
            throw new RuntimeException("index out of range");
        }
    }

    private void expand(){
        E tmp[] = (E[])new Object[count*2+1];
        System.arraycopy(list,0,tmp,0,count);
        list = tmp;
    }

    @Override
    public void remove(E item) {
        int indx = 1;
        if (item != null){
            for (E acc: list) {
                if (item.equals(acc)){
                    System.arraycopy(list,indx,list,indx-1,list.length-indx);
                    count--;
                }
                indx++;
            }
        }
    }

    @Override
    public int size() {
        return count;
    }
}
