/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author O. Apolinar
 */
public class ListaDeUsuario {
    
    private ArrayList<Usuario> Personas;
    private Tabla1 Tabla1; 
    
    public ListaDeUsuario (){
        Personas=new ArrayList();
        Tabla1=new Tabla1(Personas);
    }
    
    public void agregar(String Nom,String Ape,Cuenta Cue,String Mat,String Tel,String Con){
        Usuario nueva=new Usuario(Nom,Ape,Cue,Mat,Tel,Con);
        Personas.add(nueva);
        Tabla1.fireTableChanged(null);
        guardar();
    }
    
    public void modificar(int index,String Nom,String Ape,Cuenta Cue,String Mat,String Tel,String Con){
        Usuario editar=Personas.get(index);
        editar.setNombre(Nom);
        editar.setApellido(Ape);
        editar.setCuenta(Cue);
        editar.setMatricula(Mat);
        editar.setTelefono(Tel);
        editar.setContraseña(Con);
        Tabla1.fireTableRowsUpdated(index,index);
        Tabla1.fireTableChanged(null);
        guardar();
    }
    public Usuario ver(int index){
        Usuario persona=Personas.get(index);
        return persona;
    }
    
    public void eliminar(int index){
        Personas.remove(index);
        Tabla1.fireTableRowsUpdated(index,index);
        Tabla1.fireTableChanged(null);
    }

    public ArrayList<Usuario> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Usuario> Personas) {
        this.Personas = Personas;
    }

    public Tabla1 getTabla1() {
        return Tabla1;
    }

    public void setTabla1(Tabla1 Tabla1) {
        this.Tabla1 = Tabla1;
    }
    
    public void guardar(){
        ObjectOutputStream out;
        try{
            out=new ObjectOutputStream(new FileOutputStream("Personas.dat"));
            Usuario[] personasArray=Personas.toArray(new Usuario[Personas.size()]);
            out.writeObject(personasArray);
            out.close();
        }catch(IOException ex){
        }
    }
    
    public void cargar(){
        ObjectInputStream in;
        try{
            in=new ObjectInputStream(new FileInputStream("Personas.dat"));
            Usuario[] personasArray=(Usuario[]) in.readObject();
            Personas.clear();
            Personas.addAll(Arrays.asList(personasArray));
            in.close();
        }catch(Exception ex){
        }
    }
    
}
