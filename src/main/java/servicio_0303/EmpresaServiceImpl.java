/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio_0303;

/**
 *
 * @author karly
 */
import java.util.ArrayList;
import java.util.List;
import modelo_0303.Empresa;


public class EmpresaServiceImpl implements EmpresaService {
    
    private List<Empresa> empresaList;
    

    public EmpresaServiceImpl() {
        this.empresaList= new ArrayList<>();
    }

    @Override
    public void crear(Empresa empresa) {
        
        this.empresaList.add(empresa);
 
        }

    @Override
    public void modificar(int codigo, Empresa empresaModificado) {
        
         var indice=0;
        
        this.empresaList.set(indice, empresaModificado);
        
       }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var empleado:this.empresaList){
            if(empleado.getCodigo()== codigo){
                this.empresaList.remove(indice);
                
                break;
            }else{
                indice++;
            }
        }
        
        
        }

    @Override
    
    public List<Empresa> listar() {
        
        return this.empresaList;
        
        }

    
    
}

