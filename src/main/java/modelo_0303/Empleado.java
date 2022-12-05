/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_0303;

import java.time.LocalDate;

/**
 *
 * @author kevinandres
 */
public class Empleado {
    
    
    private String nombreEmpleado;
    private int codigo;
    private String puesto;
    private LocalDate fechaNacimiento;
    

    public Empleado(String nombreEmpleado, int codigo, String puesto, LocalDate fechaNacimiento) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigo = codigo;
        this.puesto = puesto;
        this.fechaNacimiento = fechaNacimiento;
      
    }
    

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + 
                ", codigo="  + codigo + 
                ", puesto="  + puesto + 
                ", fechaNacimiento="  + fechaNacimiento + '}';
    }



    
    
    
    
    
    
    
    
    
}
