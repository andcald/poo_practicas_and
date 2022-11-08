/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Asignatura {

    private String nombre;
    private int horasSemanales;
    private Grupo materia;

    public String mostrarInfoAsignatura() {
        return " El nombre de la asignatura es: " + this.getNombre() + " las horas semanales de la asignatura es: " + this.getHorasSemanales()
                + ". El numero del grupo es: " + this.materia.getNumeroGrupo() + " EL profesor es  :" + this.materia.getDocencia().getNombre();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setMateria(Grupo materia) {
        this.materia = materia;
    }

    public Grupo getMateria() {
        return materia;
    }


}
