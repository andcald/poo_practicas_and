/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_servicio;

import poo_0303_controlador.EmpleadoControl;
import java.util.ArrayList;
import java.util.List;
import poo_0303_modelo.Departamento;
import poo_0303_modelo.Empleado;

/**
 *
 * @author kevinandres
 */
public class DepartamentoServiceImpl implements DepartamentoService {

    private List<Departamento> departamentoList;
    private List<Empleado> empleadoAsignado;

    public DepartamentoServiceImpl() {
        this.departamentoList = new ArrayList<>();
        this.empleadoAsignado = new ArrayList<>();

    }

    @Override
    public void crear(Departamento departamento) {

        this.departamentoList.add(departamento);

    }

    @Override

    public List<Departamento> listar() {

        return this.departamentoList;

    }

    @Override
    public void asignarEmpleado(Empleado empleado, int codigo) {
        for (var i = 0; i < this.departamentoList.size(); i++) {

            if (codigo == departamentoList.get(i).getCodigo()) {

                this.empleadoAsignado.add(empleado);
                break;
            }
        }
    }

    @Override
    public List<Empleado> listarEmpleado() {
       return this.empleadoAsignado;
    }

   


    
    
    

 

   

}
