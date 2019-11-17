import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class People implements AutoCloseable {
    private static final Logger LOGGER=Logger.getLogger(AtmMain.class.getName());
    @Override
    public void close() throws Exception {
        LOGGER.log(Level.INFO, "Pepole.Close");
    }

    public static void main(String[] args) {
        try (People pl=new People()) {
            System.out.println("Calling finally");
        }
        catch (Exception ex)
        {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }
}
