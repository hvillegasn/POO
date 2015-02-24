
package com.programandoando.hamp.singleton;

import java.sql.*;

public class Conexion {

    private static String url = "jdbc:mysql://localhost:3306/dbmodulo";
    private static String user = "root";
    private static String passwd = "";
    private static Connection connect;

    public static Connection getInstance() throws ClassNotFoundException {
        if (connect == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}
