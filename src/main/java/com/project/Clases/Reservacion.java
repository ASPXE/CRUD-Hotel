package com.project.Clases;

/**
 *
 * @author aspxe
 */
public class Reservacion {
    private int idReservacion;
    private int NumeroPersonas;
    private int NumeroNoches;
    private int fk_habitacionId;
    private int fk_serviciosId;
    
    public Reservacion(){
        
    }
    
    public Reservacion(int idReservacion){
        this.idReservacion = idReservacion;
    }
    
    public Reservacion(int idReservacion, int NumeroPersonas, int NumeroNoches, int fk_habitacionId, int fk_serviciosId){
        this.idReservacion = idReservacion;
        this.NumeroPersonas = NumeroPersonas;
        this.NumeroNoches = NumeroNoches;
        this.fk_habitacionId = fk_habitacionId;
        this.fk_serviciosId = fk_serviciosId;
    }
    
    public Reservacion(int NumeroPersonas, int NumeroNoches, int fk_habitacionId, int fk_serviciosId){
        this.NumeroPersonas = NumeroPersonas;
        this.NumeroNoches = NumeroNoches;
        this.fk_habitacionId = fk_habitacionId;
        this.fk_serviciosId = fk_serviciosId;
    }

    public int getIdReservacion() {
        return this.idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public int getNumeroPersonas() {
        return this.NumeroPersonas;
    }

    public void setNumeroPersonas(int NumeroPersonas) {
        this.NumeroPersonas = NumeroPersonas;
    }

    public int getNumeroNoches() {
        return this.NumeroNoches;
    }

    public void setNumeroNoches(int NumeroNoches) {
        this.NumeroNoches = NumeroNoches;
    }

    public int getFk_habitacionId() {
        return this.fk_habitacionId;
    }

    public void setFk_habitacionId(int fk_habitacionId) {
        this.fk_habitacionId = fk_habitacionId;
    }

    public int getFk_serviciosId() {
        return this.fk_serviciosId;
    }

    public void setFk_serviciosId(int fk_serviciosId) {
        this.fk_serviciosId = fk_serviciosId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservacion{");
        sb.append("idReservacion=").append(idReservacion);
        sb.append(", NumeroPersonas=").append(NumeroPersonas);
        sb.append(", NumeroNoches=").append(NumeroNoches);
        sb.append(", fk_habitacionId=").append(fk_habitacionId);
        sb.append(", fk_serviciosId=").append(fk_serviciosId);
        sb.append('}');
        return sb.toString();
    }
    
    
}
