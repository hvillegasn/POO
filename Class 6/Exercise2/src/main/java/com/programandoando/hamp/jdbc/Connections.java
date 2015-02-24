package com.programandoando.hamp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HAMP
 */
public class Connections {

    private static String url = "jdbc:mysql://localhost:3306/dbpatron";
    private static String user = "root";
    private static String passwd = "";
    
    private static Connection con;

    public static Connection getInstance() {
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}
