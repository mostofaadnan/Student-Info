/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FAHIM
 */
public class mysqlConnector {

    public static Connection ConnectorDb() throws InstantiationException, IllegalAccessException, SQLException {
        Connection conn = null;
        String UserName = "root";
        String Password = "123456bangladesh";
        String Database = "students";
        String ConString = "jdbc:mysql://localhost:3306/" + Database;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }

        conn = DriverManager.getConnection(ConString, UserName, Password);
        System.out.println("connected");
        return conn;

    }

}
