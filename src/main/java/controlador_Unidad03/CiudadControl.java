/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Unidad03;

import java.util.List;
import modelo_unidad03.Ciudad;
import servicio_unidad03.CiudadServiceImpl;

/**
 *
 * @author kevinandres
 */
public class CiudadControl {
    
      private CiudadServiceImpl ciudadServiceImpl = new CiudadServiceImpl();
    
    
    public void crear(String [] data){
        
        var codigo=Integer.valueOf(data[0]);
        var nombre=data[1];
        var pais=data[2];
        var poblacion=Integer.valueOf(data[3]);       
        var ciudad = new Ciudad(codigo,nombre,pais,poblacion);
        this.ciudadServiceImpl.crear(ciudad);
        
    }
    
    public List<Ciudad> listar(){
        return this.ciudadServiceImpl.listar();
    }
    
}
