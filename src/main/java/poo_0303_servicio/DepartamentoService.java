/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo_0303_servicio;

import java.util.List;
import poo_0303_modelo.Departamento;
import poo_0303_modelo.Empleado;

/**
 *
 * @author kevinandres
 */
public interface DepartamentoService {

    public void crear(Departamento departamento);
    
    public void asignarEmpleado( Empleado empleado,int codigo);
   
    public abstract List<Departamento> listar();
    
    public abstract List<Empleado> listarEmpleado();
    

}
