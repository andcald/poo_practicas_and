/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_controlador;

import java.time.LocalDate;
import java.util.List;
import poo_0303_modelo.Empleado;
import poo_0303_servicio.DepartamentoService;
import poo_0303_servicio.DepartamentoServiceImpl;
import poo_0303_servicio.EmpleadoServiceImpl;
import poo_0303_vista.VentanaEmpleado;

/**
 *
 * @author kevinandres
 */
public class EmpleadoControl {

    private EmpleadoServiceImpl empleadoServiceImpl;
    private DepartamentoServiceImpl departamentoServiceImpl;
    
    

    public EmpleadoControl() {
        this.empleadoServiceImpl = new EmpleadoServiceImpl();
        this.departamentoServiceImpl = new DepartamentoServiceImpl();
        
        
        

    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear ";
        
        
        var nombre = data[0];
        var codigo = Integer.valueOf(data[1]).intValue();
        var anio = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();

        if (anio < 1880 && mes > 12 && dia > 31) {
            retorno += " La fecha de nacimiento es incorrecta";
        } else {
            var empleado = new Empleado(nombre, codigo, LocalDate.of(anio, mes, dia));
            this.empleadoServiceImpl.crear(empleado);
            this.departamentoServiceImpl.asignarEmpleado(empleado, codigo);
            

            retorno = "Empleado " + empleado.getNombreEmpleado() + " creado correctamente";
        }
        return retorno;

    }

    public List<Empleado> listar() {
        return this.empleadoServiceImpl.listar();
    }

}
