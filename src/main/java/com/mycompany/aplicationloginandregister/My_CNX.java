
package com.mycompany.aplicationloginandregister;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo Andretta
 */

public class My_CNX {
    
    private static String serverName = "localhost";
    private static String username = "root";
    private static String dbName = "aplicationreglog";
    private static Integer portNumber = 3306;
    private static String password = "";
    
    public static Connection getConnection()
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(serverName);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumber);
        
        try{
            cnx = datasource.getConnection();
        } catch(SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return cnx;
    }
    
    
}
