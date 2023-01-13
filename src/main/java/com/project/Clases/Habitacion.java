package com.project.Clases;

/**
 *
 * @author aspxe
 */
public class Habitacion {
    private int idHabitacion;
    private int Categoria;
    private double PrecioPorNoche;
    private double SizeM2;
    private int NumeroCamas;
    
    public Habitacion(){
        
    }
    
    public Habitacion(int idHabitacion){
        this.idHabitacion = idHabitacion;
    }
    
    public Habitacion(int idHabitacion, int Categoria, double PrecioPorNoche, double SizeM2, int NumeroCamas){
        this.idHabitacion = idHabitacion;
        this.Categoria = Categoria;
        this.PrecioPorNoche = PrecioPorNoche;
        this.SizeM2 = SizeM2;
        this.NumeroCamas = NumeroCamas;
    }
    
    public Habitacion(int Categoria, double PrecioPorNoche, double SizeM2, int NumeroCamas){
        this.Categoria = Categoria;
        this.PrecioPorNoche = PrecioPorNoche;
        this.SizeM2 = SizeM2;
        this.NumeroCamas = NumeroCamas;
    }

    public int getIdHabitacion() {
        return this.idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public double getPrecioPorNoche() {
        return this.PrecioPorNoche;
    }

    public void setPrecioPorNoche(double PrecioPorNoche) {
        this.PrecioPorNoche = PrecioPorNoche;
    }

    public double getSizeM2() {
        return this.SizeM2;
    }

    public void setSizeM2(double SizeM2) {
        this.SizeM2 = SizeM2;
    }

    public int getNumeroCamas() {
        return this.NumeroCamas;
    }

    public void setNumeroCamas(int NumeroCamas) {
        this.NumeroCamas = NumeroCamas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habitacion{");
        sb.append("idHabitacion=").append(idHabitacion);
        sb.append(", Categoria=").append(Categoria);
        sb.append(", PrecioPorNoche=").append(PrecioPorNoche);
        sb.append(", SizeM2=").append(SizeM2);
        sb.append(", NumeroCamas=").append(NumeroCamas);
        sb.append('}');
        return sb.toString();
    }
    
    

}
