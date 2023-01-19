/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo_0304_servicio;

import java.util.List;
import poo_0304_modelo.Viaje;

/**
 *
 * @author kevinandres
 */
public interface ViajeService {
    
    public void crear(Viaje viaje);

    public List<Viaje> listar();
    
}
