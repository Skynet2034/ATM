import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import collection.impl.ListAtmCollection;
import repository.StorageRepository;
import repository.factory.StorageFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.time.Duration;
import java.time.Instant;
import java.util.Deque;

/**
 * https://vk.com/doc10903696_336361025?hash=175de31599461c95a4&dl=4850ee878a3611ed69
 * https://vk.com/wall-54530371_505
 */

public class AtmMain{

    public static void main(String[] args){

        Instant start = Instant.now();

        ListAtmCollection atmCollection = new ListAtmCollection();
        atmCollection.append(1);
        atmCollection.append(2);
        atmCollection.append(3);
        atmCollection.append(4);


        boolean item = atmCollection.remove(3);

        Instant stop = Instant.now();
        System.out.println(Duration.between(start, stop));



    }
}
