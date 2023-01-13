package com.project.Clases;

/**
 *
 * @author aspxe
 */
public class Hotel {
    private int idHotel;
    private int NumeroTrabajadores;
    private String Direccion;
    private int NumeroEstrellas;
    private int fk_habitacionIds;
    private int fk_estacionamientoIds;
    
    public Hotel(){
        
    }
    
    public Hotel(int idHotel){
        this.idHotel = idHotel;
    }
    
    public Hotel(int idHotel, int NumeroTrabajadores, String Direccion, int NumeroEstrellas, int fk_habitacionIds, int fk_estacionamientoIds){
        this.idHotel = idHotel;
        this.NumeroTrabajadores = NumeroTrabajadores;
        this.Direccion = Direccion;
        this.NumeroEstrellas = NumeroEstrellas;
        this.fk_habitacionIds = fk_habitacionIds;
        this.fk_estacionamientoIds = fk_estacionamientoIds;
    }
    
    public Hotel(int NumeroTrabajadores, String Direccion, int NumeroEstrellas, int fk_habitacionesIds, int fk_estacionamientoIds){
        this.NumeroTrabajadores = NumeroTrabajadores;
        this.Direccion = Direccion;
        this.NumeroEstrellas = NumeroEstrellas;
        this.fk_habitacionIds = fk_habitacionesIds;
        this.fk_estacionamientoIds = fk_estacionamientoIds;
    }

    public int getIdHotel() {
        return this.idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getNumeroTrabajadores() {
        return this.NumeroTrabajadores;
    }

    public void setNumeroTrabajadores(int NumeroTrabajadores) {
        this.NumeroTrabajadores = NumeroTrabajadores;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNumeroEstrellas() {
        return this.NumeroEstrellas;
    }

    public void setNumeroEstrellas(int NumeroEstrellas) {
        this.NumeroEstrellas = NumeroEstrellas;
    }

    public int getFk_habitacionIds() {
        return this.fk_habitacionIds;
    }

    public void setFk_habitacionIds(int fk_habitacionIds) {
        this.fk_habitacionIds = fk_habitacionIds;
    }

    public int getFk_estacionamientoIds() {
        return this.fk_estacionamientoIds;
    }

    public void setFk_estacionamientoIds(int fk_estacionamientoIds) {
        this.fk_estacionamientoIds = fk_estacionamientoIds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel{");
        sb.append("idHotel=").append(idHotel);
        sb.append(", NumeroTrabajadores=").append(NumeroTrabajadores);
        sb.append(", Direccion=").append(Direccion);
        sb.append(", NumeroEstrellas=").append(NumeroEstrellas);
        sb.append(", fk_habitacionIds=").append(fk_habitacionIds);
        sb.append(", fk_estacionamientoIds=").append(fk_estacionamientoIds);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
