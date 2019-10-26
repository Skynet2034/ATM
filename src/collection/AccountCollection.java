package collection;

import app.domain.Account;

import java.util.Arrays;

/**
 * Расширить класс AccountCollection  методами из интрефейса java.util.Deque
 */

public class AccountCollection {
    private Account[] list;
    private int count = 0;

    public AccountCollection(){
        this.list = new Account[10];
    }

    public AccountCollection(int length){
        this.list = new Account[length];
    }

    public int size(){
        return count;
    }

    public void add(Account account){
        if(count == list.length){
            expand();
        }
        list[count] = account;
        count++;
    }
    public void addLast(Account account)
    {
        add(account);
    }
    public void addFirst(Account account)
    {
        if(count == list.length){
            expand();
        }
        System.arraycopy(list,0,list,1,count);
        list[0]=account;
        count++;
    }
    private void expand() {
        Account tmp[] = new Account[count*2];
        System.arraycopy(list,0,tmp,0,count);
        list = tmp;
    }

    public Account get(int index){
        if (count==0) throw new RuntimeException("List is empty");
        checkIndex(index);
        return list[index];
    }

    private void checkIndex(int index) {
        if(index > count-1 || index < 0){
            throw new RuntimeException("index out of range");
        }
    }

    public void remove(Account account){
        int indx = 1;
        if (account != null){
            for (Account acc: list) {
                if (account.equals(acc)){
                    System.arraycopy(list,indx,list,indx-1,list.length-indx);
                    count--;
                }
                indx++;
            }
        }
    }

    public void remove(int indx){
        if (count==0) throw new RuntimeException("List is empty");
        checkIndex(indx);
        System.arraycopy(list,indx,list,indx-1,list.length-indx);
        count--;
    }
    public void removeFirst(){
        if (count==0) throw new RuntimeException("List is empty");
       System.arraycopy(list,1,list,0,list.length-1);
       count--;
    }
    public void removeLast(){
        if (count==0) throw new RuntimeException("List is empty");
        list[count-1]=null;
        count--;
    }

    public Account getFirst() {
        if (count == 0) throw new RuntimeException("List is empty");
        return list[0];
    }

    public Account getLast() {
        if (count == 0) throw new RuntimeException("List is empty");
        return list[count - 1];
    }
    public boolean removeFirstOccurence(Account account){
        int indx = 1;
        if (account != null){
            for (Account acc: list) {
                if (account.equals(acc)){
                    System.arraycopy(list,indx,list,indx-1,list.length-indx);
                    count--;
                    return true;
                }
                indx++;
            }
        }
        return false;
    }
    public boolean removeLastOccurence(Account account){
        int index = 0;
        int foundPos=0;
        if (account != null){
            for (Account acc: list) {
                if (account.equals(acc)){
                   foundPos=index;
                }
                index++;
            }
            System.arraycopy(list,foundPos+1,list,foundPos,list.length-foundPos-1);
            count--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String res="[";
        int i=0;
        while (list[i]!=null) {
            res += (list[i] + ", ");
            i++;
        }
        return (res.substring(0,res.length()-2)+"]");
    }
}
