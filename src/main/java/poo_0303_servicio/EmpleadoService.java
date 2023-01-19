/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo_0303_servicio;

import java.util.List;
import poo_0303_modelo.Empleado;

/**
 *
 * @author kevinandres
 */
public interface EmpleadoService {
    
     public void crear(Empleado empleado);
     
  public Empleado buscarPorCodigo(int codigo);

    public abstract List<Empleado> listar();
    
    
}
