package repository.impl;

import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import repository.StorageRepository;
import store.Storage;

public class InMemoryRepository implements StorageRepository {
    @Override
    public AtmCollection<Account> getAccounts() {
        return Storage.getAccounts();
    }

    @Override
    public AtmCollection<Treasure> getTreasure() {
        return Storage.getTreasures();
    }
}
