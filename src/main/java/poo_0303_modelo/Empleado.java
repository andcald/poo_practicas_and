/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import poo_0303_servicio.EmpresaServiceImpl;
import poo_0303_vista.VentanaEmpleado;

/**
 *
 * @author kevinandres
 */
public class Empleado {

    private String nombreEmpleado;
    private int codigo;
    private LocalDate fechaNacimiento;

    public Empleado(String nombreEmpleado, int codigo, LocalDate fechaNacimiento) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado
                + ", codigo del Departamento=" + codigo
                + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
