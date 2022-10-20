/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.poo_practicas_and;

/**
 *
 * @author kevinandres
 */
public class Poo_practicas_and {

    public static void main(String[] args) {

        var arreglo = new Arreglo();
        var vector1 = arreglo.crearVector(3);
        var vector2 = arreglo.crearVector(3);
        var matriz1 = arreglo.crearMatriz(2, 2);
        var matriz2 = arreglo.crearMatriz(2, 2);
        var vectorSumado = arreglo.sumaVector(vector1, vector2);
        var matrizSumado = arreglo.sumaMatriz(matriz1, matriz2);

        System.out.println(" vector 1            vector2 ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i] + "                        " + vector2[i]);
        }

        System.out.println("Matriz 1: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz1[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz2[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("la suma es de los vectores es ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vectorSumado[i]);
        }

        System.out.println("la suma es  ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSumado[i][j] + " ");

            }
            System.out.println();
        }

    }
}
