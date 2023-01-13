package com.project.Clases;

/**
 *
 * @author aspxe
 */
public class Administradores {
    private int idAdmin;
    private String Nombre;
    private String Password;
    
    public Administradores(){
        
    }
    
    public Administradores(int idAdmin){
        this.idAdmin = idAdmin;
    }
    
    public Administradores(int idAdmin, String Nombre, String Password){
        this.idAdmin = idAdmin;
        this.Nombre = Nombre;
        this.Password = Password;
    }
    
    public Administradores(String Nombre, String Password){
        this.Nombre = Nombre;
        this.Password = Password;
    }

    public int getIdAdmin() {
        return this.idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Administradores{");
        sb.append("idAdmin=").append(idAdmin);
        sb.append(", Nombre=").append(Nombre);
        sb.append(", Password=").append(Password);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
