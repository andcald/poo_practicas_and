/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio_0303;

import java.util.List;
import modelo_0303.Departamento;

/**
 *
 * @author kevinandres
 */
public interface DepartamentoService {
    
public void crear(Departamento departamento);

    public Departamento buscarPorCodigo(int codigo);


    public abstract List<Departamento> listar();
    
    
}
