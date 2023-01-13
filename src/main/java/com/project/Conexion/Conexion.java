package com.project.Conexion;

import java.sql.*;

/**
 *
 * @author aspxe
 */
public class Conexion {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:8080/mydb?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetreival=true";
    private static final String JDBC_USER = "ElPatron";
    private static final String JDBC_PASSWORD = "weed420hood:v";
    
    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    public static void cerrar(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void cerrar(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void cerrar(Connection conn) throws SQLException{
        conn.close();
    }
    
    public static void cerrar(Statement stmt) throws SQLException{
        stmt.close();
    }
    
}
