/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio_0303;

/**
 *
 * @author karly
 */
import java.util.List;
import modelo_0303.Empresa;


public interface EmpresaService {
    
     public void crear(Empresa empresa);

    public abstract void modificar(int telefono, Empresa empresaModificado);

    public abstract void eliminar(int telefono);

    public abstract List<Empresa> listar();
    
    
}
