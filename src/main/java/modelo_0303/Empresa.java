/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_0303;

import java.time.LocalDate;
import vista_0303.VentanaEmpresa;

/**
 *
 * @author kevinandres
 */
public class Empresa {
    
    
    private String nombreEmpresa;
    private int codigo;
    private String duenio;
    private LocalDate fechaCreacion;
    
  
    
   
   
    

    public Empresa(String nombreEmpresa, int codigo, String duenio, LocalDate fechaCreacion) {
        this.nombreEmpresa = nombreEmpresa;
        this.codigo = codigo;
        this.duenio = duenio;
        this.fechaCreacion = fechaCreacion;

        
      
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    

    

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + 
                ", codigo="  + codigo + 
                ", dueño="  + duenio + 
                ", fechaCreacion="  + fechaCreacion + '}';
    }



    
    
    
    
    
    
    
    
    
}
