/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_controlador;

import java.util.ArrayList;
import java.util.List;
import poo_0303_modelo.Departamento;
import poo_0303_modelo.Empleado;
import poo_0303_servicio.DepartamentoServiceImpl;
import poo_0303_servicio.EmpleadoServiceImpl;

/**
 *
 * @author kevinandres
 */
public class DepartamentoControl {

    private DepartamentoServiceImpl departamentoServiceImpl;
   
    

    public DepartamentoControl() {
        this.departamentoServiceImpl = new DepartamentoServiceImpl();

    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear el departamento";

        var nombre = data[0];
        var codigo = Integer.valueOf(data[1]).intValue();
        var nombreEmpresa = data[2];

        var departamento = new Departamento(nombre, codigo, nombreEmpresa);
        this.departamentoServiceImpl.crear(departamento);
   
        retorno = "Departamento " + departamento.getNombreDepartamento()
                + " creado correctamente";

        return retorno;

    }

    public List<Departamento> listar() {
        return this.departamentoServiceImpl.listar();
    }
    
    
    public List<Empleado> empleados() {
        return this.departamentoServiceImpl.listarEmpleado();
                
    }

}
