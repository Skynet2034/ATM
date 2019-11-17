import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import collection.impl.ListAtmCollection;
import repository.StorageRepository;
import repository.factory.StorageFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * https://vk.com/doc10903696_336361025?hash=175de31599461c95a4&dl=4850ee878a3611ed69
 * https://vk.com/wall-54530371_505
 */

public class AtmMain {
    private static final Logger LOGGER = Logger.getLogger(AtmMain.class.getName());

    public static void main(String[] args) {
        byte[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        OutputStream out = new ByteArrayOutputStream();
        try {
            for (byte i : arr) {
                out.write(i);
            }
        }
        catch (IOException ex)
        {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

    }
}
