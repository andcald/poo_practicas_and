/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0304_servicio;

import java.util.ArrayList;
import java.util.List;
import poo_0304_modelo.Viaje;

/**
 *
 * @author kevinandres
 */
public class ViajeServiceImpl implements ViajeService{

    private static List<Viaje> viajeList = new ArrayList<>();
    
    @Override
    public void crear(Viaje viaje) {
  
        this.viajeList.add(viaje);
    }

    @Override
    public List<Viaje> listar() {
        return this.viajeList;
    }
    
}
