package store;

import app.domain.Account;
import app.domain.Nominal;
import app.domain.Treasure;
import collection.AtmCollection;
import collection.impl.ArrayAtmCollection;

import java.util.Date;


public class Storage {

    private static AtmCollection<Treasure> treasures;
    private static AtmCollection<Account> accounts;

    static {
        loadTreasures();
        loadAccounts();
    }

    private static void loadTreasures() {

        treasures = new ArrayAtmCollection<>();
        treasures.add(new Treasure(Nominal.N10, 2000));
        treasures.add(new Treasure(Nominal.N50, 2000));
        treasures.add(new Treasure(Nominal.N100, 2000));
        treasures.add(new Treasure(Nominal.N500, 2000));
        treasures.add(new Treasure(Nominal.N1000, 2000));
        treasures.add(new Treasure(Nominal.N2000, 2000));
        treasures.add(new Treasure(Nominal.N5000, 2000));
        treasures.add(new Treasure(Nominal.N200, 2000));

    }

    private static void loadAccounts() {

        accounts = new ArrayAtmCollection<>();
        accounts.add(new Account("Artem Trunov", new Date(), "1234"));
        accounts.add(new Account("Ivan Petrov", new Date(), "2234"));
        accounts.add(new Account("Sergey Ivanov", new Date(), "2134"));

        accounts.add(new Account("Tatyana Ermakova", new Date(), "2124"));
        accounts.add(new Account("Evgeniya Volkova", new Date(), "2132"));
        accounts.add(new Account("Petya Shikachihin-Krestovozdvizjenskiy", new Date(), "2131"));

    }

    public static AtmCollection<Account> getAccounts(){
        return accounts;
    }

    public static AtmCollection<Treasure> getTreasures(){
        return treasures;
    }


}
