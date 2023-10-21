/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author User
 */
public abstract class Usuario {
    
    //private static int usuarioCodigo=0;
    //private int cdSeguido;
    private String nombre;
    private long cedula;
    private String direccion;
    private String telefono;
    private String contraseña;
    private String username;

    public Usuario() {  
        //usuarioCodigo++;
        //this.cdSeguido=usuarioCodigo;
    }

    public Usuario(String nombre, long cedula, String direccion, String telefono, String contraseña, String username) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.username = username;
        //usuarioCodigo++;
        //this.cdSeguido=usuarioCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public abstract boolean inicioSesion();
        
    public abstract String toString();
    
//    public String infoFactura()    
//        return String.format("%-15s: %s\n%-15s: %.2f\n ", 
//                             "Fecha factura", this.fechaFactura.toString(),
//                             "Valor factura", this.valorFactura);
//        
//    }
}
