/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_servicio;

import java.util.ArrayList;
import java.util.List;
import poo_0303_modelo.Empleado;

/**
 *
 * @author kevinandres
 */
public class EmpleadoServiceImpl implements EmpleadoService {

    private List<Empleado> empleadoList;
  
    

    public EmpleadoServiceImpl() {
        this.empleadoList = new ArrayList<>();
        
        
    }

    @Override
    public void crear(Empleado empleado) {

        this.empleadoList.add(empleado);

    }

    @Override

    public List<Empleado> listar() {

        return this.empleadoList;

    }

    @Override
    public Empleado buscarPorCodigo(int codigo) {
        
        Empleado retorno = null;
        for (var empleado : this.empleadoList) {
            if (codigo == empleado.getCodigo()) {
                
                
                
                retorno = empleado;
                break;
            }
        }
        return retorno;
        
        
       
    }

  

}
