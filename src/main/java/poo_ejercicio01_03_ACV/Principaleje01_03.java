/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio01_03_ACV;

/**
 *
 * @author kevinandres
 */
public class Principaleje01_03 {

    public static void main(String[] args) {
        
        
        var player1 = new Jugador();
        player1.setNombre("Kevin DeBruyne");
        player1.setFechaNacimiento(1991);
        player1.setPosicion("Medio Campista");
        
        
        var team1 = new Equipo();
        player1.setTeam(team1);
        team1.setNombreEquipo("Manchester City");
        
        
        var pais1 =  new Pais();
        team1.setNombrep(pais1);
        pais1.setNombrePais("Inglaterra");
        pais1.setLiga("Premier");
        
        System.out.println(player1.mostrarInfoJugador());
        
        
        
        
        
        
        
/*
        var alfaro = new DirectorTecnico();
        alfaro.setNombre("Gustavo Alfaro");
        alfaro.setNacionalidad("Argentina");
        alfaro.setFechaNacimiento(1962);
        alfaro.setYearsTrayectoria(20);

        var ecuador = new Seleccion();
        ecuador.setCodigoFIFA("ECU");
        ecuador.setNombre("Federación Ecuatoriana de Fútbol (FEF)");
        ecuador.setParticipacionesMundial(4);
        ecuador.setSeleccionador(alfaro);
        alfaro.setEquipo(ecuador);
        

        var chile = new Seleccion();
        chile.setCodigoFIFA("CHI");
        chile.setNombre("Federación Chilena de Fútbol (FCF)");
        chile.setParticipacionesMundial(9);

        var enner = new Jugador();
        enner.setNombre("Enner Valencia");
        enner.setPosicion("Goleador");
        enner.setFechaNacimiento(1989);

        var byron = new Jugador();
        byron.setNombre("Byron Castillo");
        byron.setPosicion("Defensa");
        byron.setFechaNacimiento(1998);
        byron.setEquipo(ecuador);

        var reyArturo = new Jugador();
        reyArturo.setNombre("Arturo Vidal");
        reyArturo.setPosicion("Mediocampo");
        reyArturo.setFechaNacimiento(1987);
        reyArturo.setEquipo(chile);

        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostrarInfoJugador());
        System.out.println(reyArturo.mostrarInfo());
        System.out.println(alfaro.mostrarInfoDirector());
*/

    }

}