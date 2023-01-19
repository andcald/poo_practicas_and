/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_modelo;

import poo_ejercicio_ArrayList.Libro;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import poo_0303_servicio.DepartamentoServiceImpl;

/**
 *
 * @author kevinandres
 */
public class Departamento {
    

    private String nombreDepartamento;
    private int codigo;
    private String nombreEmpresa;
    private DepartamentoServiceImpl departamentoServiceImpl = new DepartamentoServiceImpl();
    private List empleado = new ArrayList<>();
    

    public Departamento(String nombreDepartamento, int codigo, String nombreEmpresa) {
        this.nombreDepartamento = nombreDepartamento;
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        
    }
    
     
    public void AgregarEmpleado(){
        empleado = this.departamentoServiceImpl.listarEmpleado();

}     
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Departamento{" + "nombreDepartamento=" + nombreDepartamento + ", codigo=" + codigo + 
                "Los empleado en el departamento son:" + empleado + '}';
    }

    
    


    
}
