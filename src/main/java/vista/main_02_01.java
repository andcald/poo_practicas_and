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
public class main_02_01 {

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

        data[0] = "Travis Bickle";
        data[1] = "Robert DeNiro";
        data[2] = "8575";
        data[3] = "Actor Principal";
        data[4] = "1945";
        data[5] = "8";
        data[6] = "17";
        personajeControlador.crear(data);

        data[0] = "Theodore Kerabatsos";
        data[1] = "Steve Buscemi";
        data[2] = "8576";
        data[3] = "Actor Secundario";
        data[4] = "1957";
        data[5] = "12";
        data[6] = "13";
        personajeControlador.crear(data);

        data[0] = "Mia Wallace";
        data[1] = "Uma Truman";
        data[2] = "8577";
        data[3] = "Actriz Secundaria";
        data[4] = "1970";
        data[5] = "4";
        data[6] = "29";
        personajeControlador.crear(data);

        //System.out.println(personajeControlador.crear(data));
        System.out.println(personajeControlador.getPersonajeServicioImpl().listar());
        personajeControlador.getPersonajeServicioImpl().eliminar(8574);

        System.out.println(personajeControlador.getPersonajeServicioImpl().listar());

    }

}
