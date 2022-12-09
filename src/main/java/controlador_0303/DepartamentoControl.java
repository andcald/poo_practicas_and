/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_0303;

import java.util.List;
import modelo_0303.Departamento;
import servicio_0303.DepartamentoServiceImpl;

/**
 *
 * @author kevinandres
 */
public class DepartamentoControl {
    
     private DepartamentoServiceImpl departamentoServiceImpl;
    
    

    public DepartamentoControl() {
        this.departamentoServiceImpl = new DepartamentoServiceImpl();
     
        
    }

    
    public String crear(String [] data){
        var retorno="No se pudo crear el departamento";
        
    
        var nombre=data[0];
        var codigo=Integer.valueOf(data[1]).intValue();
        
            var departamento = new Departamento(nombre , codigo );
            this.departamentoServiceImpl.crear(departamento);
            
            retorno = "Departamento " + departamento.getNombreDepartamento() 
                    + " creado correctamente";
       
        return retorno;
        
        
        
    }
    
    public List<Departamento> listar(){
        return this.departamentoServiceImpl.listar();
    }
    
    
    
    
}
    
