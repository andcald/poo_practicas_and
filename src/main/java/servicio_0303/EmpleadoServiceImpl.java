/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio_0303;

import java.util.ArrayList;
import java.util.List;
import modelo_0303.Empleado;

/**
 *
 * @author kevinandres
 */
public class EmpleadoServiceImpl implements EmpleadoService {
    
    private List<Empleado> empleadoList;
    

    public EmpleadoServiceImpl() {
        this.empleadoList= new ArrayList<>();
    }

    @Override
    public void crear(Empleado empleado) {
        
        this.empleadoList.add(empleado);
 
        }
    
    @Override
    
    public List<Empleado> listar() {
        
        return this.empleadoList;
        
        }

    
    
}
