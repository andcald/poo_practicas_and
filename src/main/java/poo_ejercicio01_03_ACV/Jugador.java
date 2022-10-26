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

    /*
    private String posicion;
    private Seleccion equipo;
    public String mostrarInfoJugador(){
    return this.mostrarInfo()+" juega en la posición de: "+this.posicion
    +" pertenece al esquipo de: "+this.equipo.getNombre();
    }
    public String getPosicion() {
    return posicion;
    }
    
    public Seleccion getEquipo() {
    return equipo;
    }
    public void setEquipo(Seleccion equipo) {
    this.equipo = equipo;
    }
     */
}
