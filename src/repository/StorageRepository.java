package repository;

import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;

public interface StorageRepository {
    AtmCollection<Account> getAccounts();
    AtmCollection<Treasure> getTreasure();
}
