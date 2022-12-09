/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_0303;

import java.time.LocalDate;
import java.util.List;
import modelo_0303.Empleado;
import servicio_0303.DepartamentoServiceImpl;
import servicio_0303.EmpleadoServiceImpl;
import vista_0303.VentanaEmpleado;

/**
 *
 * @author kevinandres
 */
public class EmpleadoControl {

    private EmpleadoServiceImpl empleadoServiceImpl;
    private DepartamentoServiceImpl departamentoServiceImpl  = new DepartamentoServiceImpl();
    
  
    

    public EmpleadoControl() {
        this.empleadoServiceImpl = new EmpleadoServiceImpl();
        
        
    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear el empleado";
        var nombre = data[0];
        var codigo = this.departamentoServiceImpl.buscarPorCodigo(Integer.valueOf(data[1]).intValue());
        var puesto = data[2];
        var anio = Integer.valueOf(data[3]).intValue();
        var mes = Integer.valueOf(data[4]).intValue();
        var dia = Integer.valueOf(data[5]).intValue();

        if (anio < 1980 && mes > 12 && dia > 31) {
            retorno += " La fecha de nacimiento es incorrecta";
        } else {
            var empleado = new Empleado(nombre, codigo, LocalDate.of(anio, mes, dia));
            this.empleadoServiceImpl.crear(empleado);

            retorno = "Empleado " + empleado.getNombreEmpleado() + " creado correctamente";
        }
        return retorno;
       
    }
    
    
    
     
    
    public List<Empleado> listar() {
        return this.empleadoServiceImpl.listar();
    }

}
