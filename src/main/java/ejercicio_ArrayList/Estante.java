/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinandres
 */
public class Estante {
    
    
    
    
    
    private String nombreEstante;
    private ArrayList<Libro> libroList= new ArrayList();

    
    public Estante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }



     
    public void AgregarLibroEstante(Libro libro1){
        this.libroList.add(libro1);

} 
    
    public void mostrarLibros(){
        for (int i = 0; i < libroList.size() ; i++) {
            System.out.println(libroList.get(i));       
        }
    
    }
    
    
    
    
    

    public String getNombreEstante() {
        return nombreEstante;
    }

    public void setNombreEstante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }
    
 
   
    
    
    @Override
    public String toString() {
        return "Nombre Estante: "+ this.nombreEstante ;
    }
    

            
            
}
