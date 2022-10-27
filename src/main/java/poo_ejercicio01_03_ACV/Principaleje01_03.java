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

        // var player1 = new Jugador("Medio Campista",team1,"Kevin DebRauyne",1991);
        /*
        player1.setNombre("Kevin DeBruyne");
        player1.setFechaNacimiento(1991);
        player1.setPosicion("Medio Campista");
       
         empleado1.setNombre("Andres");
        empleado1.setFechaNacimiento(1999);
        empleado1.setAnioIngreso("2018");
         */
        var team1 = new Equipo();
        var player1 = new Jugador("Medio Campista", team1, "Kevin DeBruayne", 1991);
        player1.setTeam(team1);
        team1.setNombreEquipo("Manchester City");

        var pais1 = new Pais();
        team1.setNombrep(pais1);
        pais1.setNombrePais("Inglaterra");
        pais1.setLiga("Premier");
        //----------------------------------------------

        var puesto = new Departamento();
        var empleado1 = new Empleado("2018", puesto, "Andres", 1999);
        puesto.setCodigoDepartamento(9012);
        puesto.setNombreDepartamento("Gerencia");
        empleado1.setPuesto(puesto);

        var empresa = new Empresa();
        empresa.setNombre("General Electric");
        puesto.setEmpresa(empresa);
        
        
        var profesor1 = new Profesor("Licenciada","Paola Fernanda",1998);
        
        var clase1 = new Asignatura();
        clase1.setNombre("Lenguaje");
        clase1.setHorasSemanales(40);
        
        var grupo = new Grupo();
        clase1.setMateria(grupo);
        grupo.setNumeroGrupo(12);
        grupo.setNumeroEstudiantes(40);
        grupo.setDocencia(profesor1);
        
        
        
        
        

        System.out.println(player1.mostrarInfoJugador());
        System.out.println(empleado1.mostrarInfoEmpleado());
        System.out.println(clase1.mostrarInfoAsignatura());

        //System.out.println(empleado1.mostrarInfoEmpleado());
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
