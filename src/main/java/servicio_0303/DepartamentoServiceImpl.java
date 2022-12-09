/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio_0303;

import java.util.ArrayList;
import java.util.List;
import modelo_0303.Departamento;

/**
 *
 * @author kevinandres
 */
public class DepartamentoServiceImpl  implements DepartamentoService {
    
    private List<Departamento> departamentoList;
    

    public DepartamentoServiceImpl() {
        this.departamentoList= new ArrayList<>();
    }

    @Override
    public void crear(Departamento departamento) {
        
        this.departamentoList.add(departamento);
 
        }



    @Override
    
    public List<Departamento> listar() {
        
        return this.departamentoList;
        
        }

    @Override
    public Departamento buscarPorCodigo(int codigo) {
        
         Departamento retorno=null;
         
        for(var departamento:this.departamentoList){
            if(codigo==departamento.getCodigo()){
                retorno=departamento;
                break;
            }
        }
        return retorno;
    }

    
    
}