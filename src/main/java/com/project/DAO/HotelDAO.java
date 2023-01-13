package com.project.DAO;
import com.project.Clases.Hotel;
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
public class HotelDAO {
    private static final String SQL_SELECT = "SELECT idHotel, NumeroTrabajadores, Direccion, NumeroEstrellas, fk_habitacionesIds, fk_estacionamientoIds FROM Hotel";
    private static final String SQL_INSERT = "INSERT INTO Hotel(NumeroTrabajadores, Direccion, NumeroEstrellas, fk_habitacionesIds, fk_estacionamientoIds) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE_TODO = "UPDATE Hotel SET NumeroTrabajadores = ?, Direccion = ?, NumeroEstrellas = ?, fk_habitacionesIds = ?, fk_estacionamientoIds = ? WHERE idHotel = ?";
    private static final String SQL_UPDATE_NUMERO_TRABAJADORES = "UPDATE Hotel SET NumeroTrabajadores = ? WHERE idHotel = ?";
    private static final String SQL_UPDATE_DIRECCION = "UPDATE Hotel SET Direccion = ? WHERE idHotel = ?";
    private static final String SQL_UPDATE_NUMERO_ESTRELLAS = "UPDATE Hotel SET NumeroEstrellas = ? WHERE idHotel = ?";
    private static final String SQL_DELETE = "DELETE FROM Hotel WHERE idHotel = ?";
    
    public List<Hotel> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Hotel hotel = new Hotel();
        List<Hotel> hoteles = new ArrayList<>();
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idHotel = rs.getInt("idHotel");
            int numeroTrabajadores = rs.getInt("NumeroTrabajadores");
            String direccion = rs.getString("Direccion");
            int numeroEstrellas = rs.getInt("NumeroEstrellas");
            int fk_habitacionIds = rs.getInt("fk_habitacionIds");
            int fk_estacionamientoIds = rs.getInt("fk_estacionamientonIds");
            
            hotel = new Hotel(idHotel, numeroTrabajadores, direccion, numeroEstrellas, fk_habitacionIds, fk_estacionamientoIds);
            
            hoteles.add(hotel);
        }
        
        Conexion.cerrar(rs);
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return hoteles;
    }
    
    public int insertar(Hotel h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setInt(1, h.getNumeroTrabajadores());
        stmt.setString(2, h.getDireccion());
        stmt.setInt(3, h.getNumeroEstrellas());
        stmt.setInt(4, h.getFk_habitacionIds());
        stmt.setInt(5, h.getFk_estacionamientoIds());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTodo(Hotel h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TODO);
        stmt.setInt(1, h.getNumeroTrabajadores());
        stmt.setString(2, h.getDireccion());
        stmt.setInt(3, h.getNumeroEstrellas());
        stmt.setInt(4, h.getFk_habitacionIds());
        stmt.setInt(5, h.getFk_estacionamientoIds());
        stmt.setInt(6, h.getIdHotel());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNumeroTrabajadores(Hotel h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NUMERO_TRABAJADORES);
        stmt.setInt(1, h.getNumeroTrabajadores());
        stmt.setInt(2, h.getIdHotel());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarDireccion(Hotel h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_DIRECCION);
        stmt.setString(1, h.getDireccion());
        stmt.setInt(2, h.getIdHotel());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNumeroEstrellas(Hotel h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NUMERO_ESTRELLAS);
        stmt.setInt(1, h.getNumeroEstrellas());
        stmt.setInt(2, h.getNumeroEstrellas());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int eliminar(Hotel h) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, h.getIdHotel());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
}
