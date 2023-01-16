package com.project.DAO;
import com.project.Clases.Servicios;
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
public class ServiciosDAO {
    private static final String SQL_SELECT = "SELECT idServicios, TourGuiado, Transporte, Lavanderia, Gimnasio FROM Servicios";
    private static final String SQL_INSERT = "INSERT INTO Servicios(TourGuiado, Transporte, Lavanderia, Gimnasio) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE_TODO = "UPDATE Servicios SET TourGuiado = ?, Transporte = ?, Lavanderia = ?, Gimnasio = ? WHERE idServicios = ?";
    private static final String SQL_UPDATE_TOUR_GUIADO = "UPDATE Servicios SET TourGuiado = ? WHERE idServicios = ?";
    private static final String SQL_UPDATE_TRANSPORTE = "UPDATE Servicios SET Transporte = ? WHERE idServicios = ?";
    private static final String SQL_UPDATE_LAVANDERIA = "UPDATE Servicios SET Lavanderia = ? WHERE idServicios = ?";
    private static final String SQL_UPDATE_GIMNASIO = "UPDATE Servicios SET Gimnasio = ? WHERE idServicios = ?";
    private static final String SQL_DELETE = "DELETE FROM Servicios WHERE idServicos = ?";
    
    public List<Servicios> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Servicios servicio = new Servicios();
        List<Servicios> servicios = new ArrayList<>();
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idServicios = rs.getInt("idServicios");
            boolean tourGuiado = rs.getBoolean("TourGuiado");
            boolean transporte = rs.getBoolean("Transporte");
            boolean lavanderia = rs.getBoolean("Lavanderia");
            boolean gimnasio = rs.getBoolean("Gimnasio");
            
            servicio = new Servicios(idServicios, tourGuiado, transporte, lavanderia, gimnasio);
            
            servicios.add(servicio);
        }
        
        Conexion.cerrar(rs);
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return servicios;
    }
    
    public int insertar(Servicios s) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setBoolean(1, s.isTourGuiado());
        stmt.setBoolean(2, s.isTransporte());
        stmt.setBoolean(3, s.isLavanderia());
        stmt.setBoolean(4, s.isGimnasio());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTodo(Servicios s) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TODO);
        stmt.setBoolean(1, s.isTourGuiado());
        stmt.setBoolean(2, s.isTransporte());
        stmt.setBoolean(3, s.isLavanderia());
        stmt.setBoolean(4, s.isGimnasio());
        stmt.setInt(5, s.getIdServicios());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTourGuiado(Servicios s) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TOUR_GUIADO);
        stmt.setBoolean(1, s.isTourGuiado());
        stmt.setInt(2, s.getIdServicios());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTransporte(Servicios s) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TRANSPORTE);
        stmt.setBoolean(1, s.isTransporte());
        stmt.setInt(2, s.getIdServicios());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarLavanderia(Servicios s) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_LAVANDERIA);
        stmt.setBoolean(1, s.isLavanderia());
        stmt.setInt(2, s.getIdServicios());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarGimnasio(Servicios s) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_GIMNASIO);
        stmt.setBoolean(1, s.isGimnasio());
        stmt.setInt(2, s.getIdServicios());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int eliminar(Servicios s) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, s.getIdServicios());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
}
