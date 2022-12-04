/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.PersonajeControlador;
import java.time.LocalDate;
import java.util.List;
import modelo.Pelicula;

/**
 *
 * @author kevinandres
 */
public class main {

    public static void main(String[] args) {

        var personajeControlador = new PersonajeControlador();
        var data = new String[7];
        data[0] = "Michael Corleone";
        data[1] = "Al Pacino";
        data[2] = "8574";
        data[3] = "Actor Principal";
        data[4] = "1940";
        data[5] = "4";
        data[6] = "25";
        personajeControlador.crear(data);
        //System.out.println(personajeControlador.crear(data));
        data[0] = "Mia Wallace";
        data[1] = "Uma Truman";
        data[2] = "8575";
        data[3] = "Actriz Secundaria";
        data[4] = "1970";
        data[5] = "4";
        data[6] = "29";
        personajeControlador.crear(data);

        data[0] = "Donkey";
        data[1] = "Eddie Murphy";
        data[2] = "8576";
        data[3] = "Actor de Reparto";
        data[4] = "1961";
        data[5] = "4";
        data[6] = "3";
        personajeControlador.crear(data);

        data[0] = "Octavio";
        data[1] = "Gael García Bernal";
        data[2] = "8577";
        data[3] = "Actor Secundario";
        data[4] = "1978";
        data[5] = "11";
        data[6] = "30";
        personajeControlador.crear(data);

        //System.out.println(personajeControlador.crear(data));
        System.out.println(personajeControlador.getPersonajeServicioImpl().listar());
        personajeControlador.getPersonajeServicioImpl().eliminar(8574);

        System.out.println(personajeControlador.getPersonajeServicioImpl().listar());

    }

}
