package repository.factory;

import repository.StorageRepository;
import repository.impl.InMemoryRepository;

public class StorageFactory {

    public static StorageRepository getStorage(){
        return new InMemoryRepository();
    }

}
