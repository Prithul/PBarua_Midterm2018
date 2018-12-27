package design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;

public class ConnectionToMySql {

    public Connection get_connection(){

        Connection connection = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Fortune_Employee","root","peekaboo2018");

            System.out.println("Connection Established");

        } catch(Exception e){

            System.out.println(e);
        }

        return connection;
    }



}
