/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio_unidad03;

import java.util.List;
import modelo_unidad03.Viaje;

/**
 *
 * @author kevinandres
 */
public interface ViajeService {
    
    public void crear(Viaje viaje);

    public List<Viaje> listar();
    
}
