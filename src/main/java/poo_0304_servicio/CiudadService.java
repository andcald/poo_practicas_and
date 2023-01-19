/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo_0304_servicio;

import java.util.List;
import poo_0304_modelo.Ciudad;

/**
 *
 * @author kevinandres
 */
public interface CiudadService {
    
    
    public void crear(Ciudad ciudad);
    public Ciudad buscarPorCodigo(int codigo);
    public List<Ciudad> listar();

    
}
