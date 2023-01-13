package com.project.DAO;
import com.project.Clases.Habitacion;
import com.project.Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author aspxe
 */
public class HabitacionDAO {
    private static final String SQL_SELECT = "SELECT idHabitacion, Categoria, PrecioPorNoche, SizeM2, NumeroCamas FROM Habitacion";
    private static final String SQL_INSERT = "INSERT INTO Habitacion(Categoria, PrecioPorNoche, SizeM2, NumeroCamas) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE_TODO = "UPDATE Habitacion SET Categoria = ?, PrecioPorNoche = ?, SizeM2 = ?, NumeroCamas = ? WHERE idHabitacion = ?";
    private static final String SQL_UPDATE_CATEGORIA = "UPDATE Habitacion SET Categoria = ? WHERE idHabitacion = ?";
    private static final String SQL_UPDATE_PRECIO_POR_NOCHE = "UPDATE Habitacion SET PrecioPorNoche = ? WHERE idHabitacion = ?";
    private static final String SQL_UPDATE_SIZE_M2 = "UPDATE Habitacion SET SizeM2 = ? WHERE idHabitacion = ?";
    private static final String SQL_UPDATE_NUMERO_CAMAS = "UPDATE Habitacion SET NumeroCamas = ? WHERE idHabitacion = ?";
    private static final String SQL_DELETE = "DELETE FROM Habitacion WHERE idHabitacion = ?";
    
    public List<Habitacion> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Habitacion habitacion = new Habitacion();
        List<Habitacion> habitaciones = new ArrayList<>();
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idHabitacion = rs.getInt("idHabitacion");
            int categoria = rs.getInt("Categoria");
            double precioPorNoche = rs.getDouble("PrecioPorNoche");
            double sizeM2 = rs.getDouble("SizeM2");
            int numeroCamas = rs.getInt("NumeroCamas");
            
            habitacion = new Habitacion(idHabitacion, categoria, precioPorNoche, sizeM2, numeroCamas);
            
            habitaciones.add(habitacion);
        }
        
        Conexion.cerrar(rs);
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return habitaciones;
    }
    
    public int insertar(Habitacion h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setInt(1, h.getCategoria());
        stmt.setDouble(2, h.getPrecioPorNoche());
        stmt.setDouble(3, h.getSizeM2());
        stmt.setInt(4, h.getNumeroCamas());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTodo(Habitacion h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TODO);
        stmt.setInt(1, h.getCategoria());
        stmt.setDouble(2, h.getPrecioPorNoche());
        stmt.setDouble(3, h.getSizeM2());
        stmt.setInt(4, h.getNumeroCamas());
        stmt.setInt(5, h.getIdHabitacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarCategoria(Habitacion h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_CATEGORIA);
        stmt.setInt(1, h.getCategoria());
        stmt.setInt(2, h.getIdHabitacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
        
    }
    
    public int actualizarPrecioPorNoche(Habitacion h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_PRECIO_POR_NOCHE);
        stmt.setDouble(1, h.getPrecioPorNoche());
        stmt.setInt(2, h.getIdHabitacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarSizeM2(Habitacion h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_SIZE_M2);
        stmt.setDouble(1, h.getSizeM2());
        stmt.setInt(2, h.getIdHabitacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNumeroCamas(Habitacion h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NUMERO_CAMAS);
        stmt.setInt(1, h.getNumeroCamas());
        stmt.setInt(2, h.getIdHabitacion());
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int eliminar(Habitacion h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, h.getIdHabitacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
}
