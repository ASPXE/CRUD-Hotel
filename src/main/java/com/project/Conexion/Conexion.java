package com.project.Conexion;

import java.sql.*;

/**
 *
 * @author aspxe
 */
public class Conexion {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:8080/";
    private static final String JDBC_USER = "";
    private static final String JDBC_PASSWORD = "";
    
    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
}
