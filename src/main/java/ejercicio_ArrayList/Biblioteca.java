/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kevinandres
 */
public class Biblioteca {
    
    private static ArrayList<Estante> estantes = new ArrayList();
    static Scanner sca = new Scanner(System.in);
     
    
    
    
    
    
    public static void main(String[] arg){
    
    
    int opcion = 0;
    
    do{
    
        System.out.println("1. Agregar Libro: ");
        System.out.println("2. Prestar Libro: ");
        System.out.println("3. Estante mas solicitado: ");
        System.out.println("4. Salir ");
        
        opcion= sca.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Ingrese datos del libro isbn&titulo");
                sca.nextLine();
                String [] datos = sca.nextLine().split("&");
                Libro libro = new Libro(datos[0],datos[1], false);
                 
                int numEstante=0;
                String nombreEstante = "";
                
                if(estantes.isEmpty()){
                    numEstante =0;
                    System.out.println("Ingrese el nombre de estante: ");
                    nombreEstante=sca.nextLine();
                            
                }else{
                    for (int i = 0; i < estantes.size(); i++) {
                        System.out.println(i+ "==" + estantes.get(i).getNombreEstante());
                        
                    }
                    
                    System.out.println(estantes.size()+" -----> Disponible");
                    System.out.println("Ingrese el numero del Estante:");
                    numEstante=sca.nextInt();
                    
                    if (numEstante>= estantes.size()) {
                    System.out.println("Ingrese el nombre de estante: ");    
                        sca.nextLine();
                        nombreEstante=sca.nextLine();            
                    }
                }
                
                agregarLibro(numEstante,nombreEstante,libro);
                
                break;
                
                case 2:
                break;
                
                case 3:
                break;
                
                case 4:
                    System.exit(0);
              
                break;
            default:
                System.out.println("Opcion no disponible");       
        }
    
    } while(opcion !=4);
    
    
    }
    
    
    public static void agregarLibro(int numEstante, String nombreEstante, Libro Libro1){
        
        if(numEstante < estantes.size()){
          
            estantes.get(numEstante).AgregarLibroEstante(Libro1);
            
        }else{
            Estante estante1 = new Estante(nombreEstante);
            estante1.AgregarLibroEstante(Libro1);
            estantes.add(estante1);
          
        
        }
       
        System.out.println(estantes);
        for (int i = 0; i< estantes.size() ; i++) {
            estantes.get(i).mostrarLibros();
             
        }
        
        
    }
    
    public static void prestarLibro(){
    
    }
    
    
    
    
    public static void mostrarEstante(){
    }
    
    
    
    
    
    
    
    
    
    
}
