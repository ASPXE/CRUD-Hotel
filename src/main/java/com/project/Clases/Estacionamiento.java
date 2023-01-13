package com.project.Clases;

/**
 *
 * @author aspxe
 */
public class Estacionamiento {
    private int idEstacionamiento;
    private int NumeroCajones;
    private double SizeM2;
    private boolean Automatizado;
    private int NumeroPisos;
    
    public Estacionamiento(){
        
    }
    
    public Estacionamiento(int idEstacionamiento){
        this.idEstacionamiento = idEstacionamiento;
    }
    
    public Estacionamiento(int idEstacionamiento, int NumeroCajones, double SizeM2, boolean Automatizado, int NumeroPisos){
        this.idEstacionamiento = idEstacionamiento;
        this.NumeroCajones = NumeroCajones;
        this.SizeM2 = SizeM2;
        this.Automatizado = Automatizado;
        this.NumeroPisos = NumeroPisos;
    }
    
    public Estacionamiento(int NumeroCajones, double SizeM2, boolean Automatizado, int NumeroPisos){
        this.NumeroCajones = NumeroCajones;
        this.SizeM2 = SizeM2;
        this.Automatizado = Automatizado;
        this.NumeroPisos = NumeroPisos;
    }

    public int getIdEstacionamiento() {
        return this.idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public int getNumeroCajones() {
        return this.NumeroCajones;
    }

    public void setNumeroCajones(int NumeroCajones) {
        this.NumeroCajones = NumeroCajones;
    }

    public double getSizeM2() {
        return this.SizeM2;
    }

    public void setSizeM2(double SizeM2) {
        this.SizeM2 = SizeM2;
    }

    public boolean isAutomatizado() {
        return this.Automatizado;
    }

    public void setAutomatizado(boolean Automatizado) {
        this.Automatizado = Automatizado;
    }

    public int getNumeroPisos() {
        return this.NumeroPisos;
    }

    public void setNumeroPisos(int NumeroPisos) {
        this.NumeroPisos = NumeroPisos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estacionamiento{");
        sb.append("idEstacionamiento=").append(idEstacionamiento);
        sb.append(", NumeroCajones=").append(NumeroCajones);
        sb.append(", SizeM2=").append(SizeM2);
        sb.append(", Automatizado=").append(Automatizado);
        sb.append(", NumeroPisos=").append(NumeroPisos);
        sb.append('}');
        return sb.toString();
    }
    
    

}
