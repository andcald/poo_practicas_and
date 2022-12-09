/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_0303;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import servicio_0303.EmpresaServiceImpl;
import vista_0303.VentanaEmpleado;

/**
 *
 * @author kevinandres
 */
public class Empleado {
    
    
    private String nombreEmpleado;
    private Departamento codigo;
    private LocalDate fechaNacimiento;
    
   
   
    

    public Empleado(String nombreEmpleado, Departamento codigo, LocalDate fechaNacimiento) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
        
    }
    
   
    

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Departamento getCodigo() {
        return codigo;
    }

    public void setCodigo(Departamento codigo) {
        this.codigo = codigo;
    }

    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + 
                ", Nombre Departamento="  + this.codigo.getNombreDepartamento()+  
                ", fechaNacimiento="  + fechaNacimiento + '}';
    }



    
    
    
    
    
    
    
    
    
}
