/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_0303;

import java.util.ArrayList;

/**
 *
 * @author kevinandres
 */
public class Empresa {
    
    private String nombreEmpresa;
    
    
    

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    
    }

    
     
    
    
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa +  '}';
    }

   
    
    
    
    
}
