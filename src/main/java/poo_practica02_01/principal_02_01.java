/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_practica02_01;

import java.time.LocalDate;

/**
 *
 * @author kevinandres
 */
public class principal_02_01 {

    public static void main(String[] args) {

        var andres = new Dueño("0106043409", "Andres Calderon", 3);
        andres.nuevoTelefono("0984357604", 0, "Móvil", "tuenti", 0);
        andres.nuevoTelefono("074078385", 2, "Casa", "Etapa", 1);
        andres.nuevoTelefono("074135250", 1287, "Fijo IP", "Etapa", 2);

        var mascota1 = new Mascota("Lucas", "Perro", "schnauzer", 5, andres);

        var atencion = new Atencion(LocalDate.now(), "Emily Calderon", 4, andres, mascota1);
        atencion.nuevaReceta("Floxamox", 12, "cada 12 horas ", 0);
        atencion.nuevaReceta("Enroflox", 5, "cada 8 horas ", 1);
        atencion.nuevaReceta("Coliflox", 12, "cada 24 horas ", 2);
        atencion.nuevaReceta("Diflovet", 12, "cada 72  horas ", 3);

        System.out.println(andres.toString());
        System.out.println(mascota1);
        System.out.println( atencion.toString());
    }

}
