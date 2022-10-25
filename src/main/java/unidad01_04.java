/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevinandres
 */
public class unidad01_04 {

    public static void main(String[] args) {

        var ecuador = new Seleccion();
        ecuador.codigoFIFA = "ECU";
        ecuador.nombre = "Federación Ecuatoriana de Fútbol (FEF)";
        ecuador.participacionesMundial = 4;
        //System.out.println(ecuador.obtienePais());

        var chile = new Seleccion();
        chile.codigoFIFA = "CHI";
        chile.nombre = "Federación Chilena de Fútbol (FCF)";
        chile.participacionesMundial = 9;
        //System.out.println(ecuador.obtienePais());

        var uruguay = new Seleccion();
        uruguay.codigoFIFA = "URU";
        uruguay.nombre = "Asociasion Uruguaya de Fútbol (AUF)";
        uruguay.participacionesMundial = 12;

        var gonzalo = new Jugador();
        gonzalo.nombre = "Gonzalo Plata";
        gonzalo.posicion = "Delantero";
        gonzalo.fechaNacimiento = 2000;
        gonzalo.equipo = ecuador;

        var diego = new Jugador();
        diego.nombre = "Diego Godin";
        diego.posicion = "Defensa";
        diego.fechaNacimiento = 1986;
        diego.equipo = uruguay;

        var arturo = new Jugador();
        arturo.nombre = "Arturo Vidal";
        arturo.posicion = "Mediocampo";
        arturo.fechaNacimiento = 1987;
        arturo.equipo = chile;

        var gustavo = new directorTecnico();
        gustavo.nombre = "Gustavo Alfaro";
        gustavo.fechaNacimiento = 1962;
        gustavo.yearInicioContrato = 2020;
        gustavo.yearFinContrato = 2022;
        gustavo.equipo = ecuador;

        var eduardo = new directorTecnico();
        eduardo.nombre = "Eduardo Berizzo";
        eduardo.fechaNacimiento = 1969;
        eduardo.yearInicioContrato = 2022;
        eduardo.yearFinContrato = 2026;
        eduardo.equipo = chile;

        var alonso = new directorTecnico();
        alonso.nombre = "Diego Alonso";
        alonso.fechaNacimiento = 1975;
        alonso.yearInicioContrato = 2021;
        alonso.yearFinContrato = 2025;
        alonso.equipo = uruguay;

        System.out.println(gonzalo.mostrarInfo());
        System.out.println(diego.mostrarInfo());
        System.out.println(arturo.mostrarInfo());
        System.out.println(gustavo.mostrarInfo());
        System.out.println(eduardo.mostrarInfo());
        System.out.println(alonso.mostrarInfo());

    }
}
