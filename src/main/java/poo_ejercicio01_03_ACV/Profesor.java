/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Profesor extends Persona{
    
    private String tituloUniversitario;
    
    
    

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public Profesor(String tituloUniversitario, String nombre, int fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.tituloUniversitario = tituloUniversitario;
    }
    
    
    
    
    
    
}
