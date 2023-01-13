package com.project.Clases;

/**
 *
 * @author aspxe
 */
public class Servicios {
    private int idServicios;
    private boolean TourGuiado;
    private boolean Transporte;
    private boolean Lavanderia;
    private boolean Gimnasio;
    
    public Servicios(){
        
    }
    
    public Servicios(int idServicios){
        this.idServicios = idServicios;
    }
    
    public Servicios(int idServicios, boolean TourGuiado, boolean Transporte, boolean Lavanderia, boolean Gimnasio){
        this.idServicios = idServicios;
        this.TourGuiado = TourGuiado;
        this.Transporte = Transporte;
        this.Lavanderia = Lavanderia;
        this.Gimnasio = Gimnasio;
    }
    
    public Servicios(boolean TourGuidado, boolean Transporte, boolean Lavanderia, boolean Gimnasio){
        this.TourGuiado = TourGuidado;
        this.Transporte = Transporte;
        this.Lavanderia = Lavanderia;
        this.Gimnasio = Gimnasio;
    }

    public int getIdServicios() {
        return this.idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public boolean isTourGuiado() {
        return this.TourGuiado;
    }

    public void setTourGuiado(boolean TourGuiado) {
        this.TourGuiado = TourGuiado;
    }

    public boolean isTransporte() {
        return this.Transporte;
    }

    public void setTransporte(boolean Transporte) {
        this.Transporte = Transporte;
    }

    public boolean isLavanderia() {
        return this.Lavanderia;
    }

    public void setLavanderia(boolean Lavanderia) {
        this.Lavanderia = Lavanderia;
    }

    public boolean isGimnasio() {
        return this.Gimnasio;
    }

    public void setGimnasio(boolean Gimnasio) {
        this.Gimnasio = Gimnasio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Servicios{");
        sb.append("idServicios=").append(idServicios);
        sb.append(", TourGuiado=").append(TourGuiado);
        sb.append(", Transporte=").append(Transporte);
        sb.append(", Lavanderia=").append(Lavanderia);
        sb.append(", Gimnasio=").append(Gimnasio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
