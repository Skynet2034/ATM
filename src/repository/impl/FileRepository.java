package repository.impl;

import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import repository.StorageRepository;

public class FileRepository implements StorageRepository {
    @Override
    public AtmCollection<Account> getAccounts() {
        return null;
    }

    @Override
    public AtmCollection<Treasure> getTreasure() {
        return null;
    }
}
