/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Jugador extends Persona {

    private String posicion;
    private Equipo team;

    public String mostrarInfoJugador() {
        return this.mostrarInfo() + " juega en la posición de: " + this.posicion
                + " la nacionalidad de su equipo es: " + this.team.nombrep.getNombrePais();
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setTeam(Equipo team) {
        this.team = team;
    }

    public Equipo getTeam() {
        return team;
    }

    public Jugador(String posicion, Equipo team, String nombre, int fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.posicion = posicion;
        this.team = team;
    }

}
