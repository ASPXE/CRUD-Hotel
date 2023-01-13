package com.project.DAO;
import com.project.Clases.Reservacion;
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
public class ReservacionDAO {
    private static final String SQL_SELECT = "SELECT idReservacion, NumeroPersonas, NumeroNoches, fk_habitacionId, fk_serviciosId FROM Reservacion";
    private static final String SQL_INSERT = "INSERT INTO Reservacion(NumeroPersonas, NumeroNoches, fk_habitacionId, fk_serviciosId) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE_TODO = "UPDATE Reservacion SET NumeroPersonas = ?, NumeroNoches = ?, fk_habitacionId = ?, fk_serviciosId = ? WHERE idReservacion = ?";
    private static final String SQL_UPDATE_NUMERO_PERSONAS = "UPDATE Reservacion SET NumeroPersonas = ? WHERE idReservacion = ?";
    private static final String SQL_UPDATE_NUMERO_NOCHES = "UPDATE Reservacion SET NumeroNoches = ? WHERE idReservacion = ?";
    private static final String SQL_DELETE = "DELETE FROM Reservacion WHERE idReservacion = ?";
    
    public List<Reservacion> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Reservacion reservacion = new Reservacion();
        List<Reservacion> reservaciones = new ArrayList<>();
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idReservacion = rs.getInt("idReservacion");
            int numeroPersonas = rs.getInt("NumeroPersonas");
            int numeroNoches = rs.getInt("NumeroNoches");
            int fk_habitacionId = rs.getInt("fk_habitacionId");
            int fk_serviciosId = rs.getInt("fk_serviciosId");
            
            reservacion = new Reservacion(idReservacion, numeroPersonas, numeroNoches, fk_habitacionId, fk_serviciosId);
            
            reservaciones.add(reservacion);
        }
        
        Conexion.cerrar(rs);
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return reservaciones;
    }
    
    public int insertar(Reservacion r) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setInt(1, r.getNumeroPersonas());
        stmt.setInt(2, r.getNumeroNoches());
        stmt.setInt(3, r.getFk_habitacionId());
        stmt.setInt(4, r.getFk_serviciosId());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTodo(Reservacion r) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TODO);
        stmt.setInt(1, r.getNumeroPersonas());
        stmt.setInt(2, r.getNumeroNoches());
        stmt.setInt(3, r.getFk_habitacionId());
        stmt.setInt(4, r.getFk_serviciosId());
        stmt.setInt(5, r.getIdReservacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNumeroPersonas(Reservacion r) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NUMERO_PERSONAS);
        stmt.setInt(1, r.getNumeroPersonas());
        stmt.setInt(2, r.getIdReservacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNumeroNoches(Reservacion r) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NUMERO_NOCHES);
        stmt.setInt(1, r.getNumeroNoches());
        stmt.setInt(2, r.getIdReservacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int eliminar(Reservacion r) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, r.getIdReservacion());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
}
