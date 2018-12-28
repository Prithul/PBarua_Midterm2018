package databases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;

public class UnitTestConnectDB {

    @Test
    public void connectionTestMySql() {

        try {
            ConnectToSqlDB.connectToSqlDatabase();
            System.out.println("MySQL Database Connected Successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void connectionTestMongoDB() {

        try {
            ConnectToMongoDB.connectToMongoDB();
            System.out.println("MongoDB Database Connected Successfully.");
        } catch (Exception e) {
           e.printStackTrace();
         }

    }
}
