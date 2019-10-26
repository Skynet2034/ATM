import app.domain.Account;
import collection.AccountCollection;
import store.Storage;

import java.util.Date;

public class AtmMain {

    public static void main(String[] args) throws ClassNotFoundException {
        AccountCollection accounts = new AccountCollection(2);
        Account acc1=new Account("vova", new Date(),"12345");
        accounts.add(acc1);
        Account acc2=new Account("vasya", new Date(),"23456");
        accounts.add(acc2);
        Account acc3=new Account("petya", new Date(),"34567");
        accounts.add(acc3);
      // System.out.println(accounts.size());
       //System.out.println(accounts);
       accounts.addFirst(acc3);
       accounts.addLast(acc1);
        System.out.println(accounts);
      accounts.removeLastOccurence(acc1);
        System.out.println(accounts);
        accounts.removeFirstOccurence(acc3);
        System.out.println(accounts);
        accounts.removeFirst();
        System.out.println(accounts);


  //      while(true){}

    }
}
