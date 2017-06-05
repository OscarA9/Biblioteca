/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author O. Apolinar
 */
public class Tabla1 extends AbstractTableModel{
    
    private ArrayList<Usuario> Usu;
    
    public Tabla1(ArrayList<Usuario> Usu){
        this.Usu=Usu;
    }

    public ArrayList<Usuario> getUsu() {
        return Usu;
    }

    public void setUsu(ArrayList<Usuario> Usu) {
        this.Usu = Usu;
    }
    
     @Override
    public int getRowCount() {
        return Usu.size();    
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Usuario U=Usu.get(i);
        switch(i1){
            case 0: return U.getNombre();
            case 1: return U.getApellido();
            case 2: return U.getCuenta();
            case 3: return U.getMatricula();
            case 4: return U.getTelefono();
            case 5: return U.getContraseña();
        }
        return null;
    }
    
    public String getColumnName(int i) {
        switch(i){
            case 0: return "Nombre";
            case 1: return "Apellido";
            case 2: return "Cuenta";
            case 3: return "Matricula";
            case 4: return "Telefono";
            case 5: return "Contraseña";
        }
        return null;
    }
}
