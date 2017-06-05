/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import java.io.Serializable;

/**
 *
 * @author O. Apolinar
 */
public class Usuario implements Serializable {
    private String Nombre;
    private String Apellido;
    private Cuenta Cuenta;
    private String Matricula;
    private String Telefono;
    private String Contraseña;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public Usuario(String Nom,String Ape,Cuenta Cue,String Mat,String Tel,String Con){
        Nombre=Nom;
        Apellido=Ape;
        Cuenta=Cue;
        Matricula=Mat;
        Telefono=Tel;
        Contraseña=Con;
    }
    public Usuario (Cuenta Cue, String Con){
        Cuenta = Cue;
        Contraseña = Con;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Cuenta getCuenta() {
        return Cuenta;
    }

    public void setCuenta(Cuenta Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String toString(){
        return Nombre+" : "+Apellido+" : "+Cuenta+" : "+Matricula+" : "+Telefono+" : "+Contraseña;
    }
}
