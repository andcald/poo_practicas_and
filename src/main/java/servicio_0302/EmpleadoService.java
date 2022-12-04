/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio_0302;

import java.util.List;
import modelo_0302.Empleado;

/**
 *
 * @author kevinandres
 */
public interface EmpleadoService {
    
     public void crear(Empleado empleado);

    public abstract void modificar(int codigo, Empleado empleadoModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Empleado> listar();
    
    
}
