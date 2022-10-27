/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
   public class Empleado extends Persona {

    private String anioIngreso;
    private Departamento puesto;

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setPuesto(Departamento puesto) {
        this.puesto = puesto;
    }

    public Departamento getPuesto() {
        return puesto;
    }

    public String mostrarInfoEmpleado() {
        return this.mostrarInfo() + " trabaja en el cargo de  " + this.puesto.getNombreDepartamento()
                + "  y pertenece a la empresa: " + this.puesto.empresa.getNombre();

    }

    public Empleado(String anioIngreso, Departamento puesto, String nombre, int fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.anioIngreso = anioIngreso;
        this.puesto = puesto;
    }
    
    

}
