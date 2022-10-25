/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevinandres
 */
public class directorTecnico {
    
    String nombre;
    int fechaNacimiento;
    int yearInicioContrato;
    int yearFinContrato;
    Seleccion equipo;

    public String mostrarInfo(){
        return this.nombre + " es el director tecnico de la " 
                + this.equipo.nombre + "\nsu contrato inicio en el " 
                + this.yearInicioContrato + " y finaliza en el " + this.yearFinContrato;
    }
    
}
