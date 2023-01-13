package com.project.DAO;
import com.project.Clases.Estacionamiento;
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
public class EstacionamientoDAO {
    private static final String SQL_SELECT = "SELECT idEstacionamiento, NumeroCajones, SizeM2, Automatizado, NumeroPisos FROM Estacionamiento";
    private static final String SQL_INSERT = "INSERT INTO Estacionamiento(NumeroCajones, SizeM2, Automatizado, NumeroPisos) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE_TODO = "UPDATE Estacionamiento SET NumeroCajones = ?, SizeM2 = ?, Automatizado = ?, NumeroPisos = ? WHERE idEstacionamiento = ?";
    private static final String SQL_UPDATE_NUMERO_CAJONES = "UPDATE Estacionamiento SET NumeroCajones = ? WHERE idEstacionamiento = ?";
    private static final String SQL_UPDATE_SIZE_M2 = "UPDATE Estacionamiento SET SizeM2 = ? WHERE idEstacionamiento = ?";
    private static final String SQL_UPDATE_AUTOMATIZADO = "UPDATE Estacionamiento SET Automatizado = ? WHERE idEstacionamiento = ?";
    private static final String SQL_UPDATE_NUMERO_PISOS = "UPDATE Estacionamiento SET NumeroPisos = ? WHERE idEstacionamiento = ?";
    private static final String SQL_DELETE = "DELETE FROM Estacionamiento WHERE idEstacionamiento = ?";
    
    public List<Estacionamiento> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Estacionamiento estacionamiento = new Estacionamiento();
        List<Estacionamiento> estacionamientos = new ArrayList<>();
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int idEstacionamiento = rs.getInt("idEstacionamiento");
            int numeroCajones = rs.getInt("NumeroCajones");
            double sizeM2 = rs.getDouble("SizeM2");
            boolean automatizado = rs.getBoolean("Automatizado");
            int numeroPisos = rs.getInt("NumeroPisos");
            
            estacionamiento = new Estacionamiento(idEstacionamiento, numeroCajones, sizeM2, automatizado, numeroPisos);
            
            estacionamientos.add(estacionamiento);
        }
        
        Conexion.cerrar(rs);
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return estacionamientos;
        
    }
    
    public int insertar(Estacionamiento e) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setInt(1, e.getNumeroCajones());
        stmt.setDouble(2, e.getSizeM2());
        stmt.setBoolean(3, e.isAutomatizado());
        stmt.setInt(4, e.getNumeroPisos());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarTodo(Estacionamiento e) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_TODO);
        stmt.setInt(1, e.getNumeroCajones());
        stmt.setDouble(2, e.getSizeM2());
        stmt.setBoolean(3, e.isAutomatizado());
        stmt.setInt(4, e.getNumeroPisos());
        stmt.setInt(5, e.getIdEstacionamiento());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNumeroCajones(Estacionamiento e) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NUMERO_CAJONES);
        stmt.setInt(1, e.getNumeroCajones());
        stmt.setInt(2, e.getIdEstacionamiento());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarSizeM2(Estacionamiento e) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_SIZE_M2);
        
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarAutomatizado(Estacionamiento e) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_AUTOMATIZADO);
        
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int actualizarNumeroPisos(Estacionamiento e) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_UPDATE_NUMERO_PISOS);
        
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
    
    public int eliminar(Estacionamiento e) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        conn = Conexion.conectar();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, e.getIdEstacionamiento());
        registros = stmt.executeUpdate();
        
        Conexion.cerrar(stmt);
        Conexion.cerrar(conn);
        
        return registros;
    }
}
