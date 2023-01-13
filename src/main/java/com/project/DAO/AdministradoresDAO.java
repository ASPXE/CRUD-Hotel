package com.project.DAO;
import com.project.Clases.Administradores;
import com.project.Conexion.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author aspxe
 */
public class AdministradoresDAO {
    private static final String SQL_SELECT = "SELECT idAdmin, Nombre, Password FROM Administradores";
    private static final String SQL_SELECT_LOG_IN = "SELECT Nombre, Password FROM Administradores WHERE Nombre = ? AND Password = ?";
    private static final String SQL_INSERT = "INSERT INTO Administradores(Nombre, Password) VALUES(?, ?)";
    private static final String SQL_UPDATE_TODO = "UPDATE Administradores SET Nombre = ?, Password = ? WHERE idAdmin = ?";
    private static final String SQL_UPDATE_NOMBRE = "UPDATE Administradores SET Nombre = ? WHERE idAdmin = ?";
    private static final String SQL_UPDATE_PASSWORD = "UPDATE Administradores SET Password = ? WHERE idAdmin = ?";
    private static final String SQL_DELETE = "DELETE FROM Administradores WHERE idAdmin = ?";
    
    public List<Administradores> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administradores admin = new Administradores();
        List<Administradores> admins = new ArrayList<>();
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idAdmin = rs.getInt("idAdmin");
            String nombre = rs.getString("Nombre");
            String password = rs.getString("Password");
            
            admin = new Administradores(idAdmin, nombre, password);
            
            admins.add(admin);
        }
        
        Conexion.cerrar(rs);
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return admins;
        
    }
    
    public List<Administradores> seleccionarAdmin(Administradores a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administradores admin = new Administradores();
        List<Administradores> admins = new ArrayList<>();
        String nombreCorrecto = null, passwordCorrecto = null;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_SELECT_LOG_IN);
        stmt.setString(1, a.getNombre());
        stmt.setString(2, a.getPassword());
        rs = stmt.executeQuery();
        
        while(rs.next()){
            String nombreDB = rs.getString("Nombre");
            String passwordDB = rs.getString("Password");
            if(nombreDB.equals(a.getNombre()) && passwordDB.equals(a.getPassword())){
                nombreCorrecto = nombreDB;
                passwordCorrecto = passwordDB;
                break;
            }else{
                nombreCorrecto = "";
                passwordCorrecto = "";
                break;
            }
        }
        
        Conexion.cerrar(rs);
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        admin = new Administradores(nombreCorrecto, passwordCorrecto);
        admins.add(admin);
        
        return admins;
        
    }
    
    public int insertar(Administradores a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setString(1, a.getNombre());
        stmt.setString(2, a.getPassword());
        registros = stmt.executeUpdate();
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTodo(Administradores a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TODO);
        stmt.setString(1, a.getNombre());
        stmt.setString(2, a.getPassword());
        stmt.setInt(3, a.getIdAdmin());
        registros = stmt.executeUpdate();
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNombre(Administradores a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NOMBRE);
        stmt.setString(1, a.getNombre());
        stmt.setInt(2, a.getIdAdmin());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarPassword(Administradores a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_PASSWORD);
        stmt.setString(1, a.getPassword());
        stmt.setInt(2, a.getIdAdmin());
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int eliminar(Administradores a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, a.getIdAdmin());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
}
