/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio_unidad03;

import java.util.List;
import modelo_unidad03.Ciudad;

/**
 *
 * @author kevinandres
 */
public interface CiudadService {
    
    
    public void crear(Ciudad ciudad);
    public Ciudad buscarPorCodigo(int codigo);
    public List<Ciudad> listar();

    
}
