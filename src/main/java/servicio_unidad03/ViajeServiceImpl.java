/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio_unidad03;

import java.util.ArrayList;
import java.util.List;
import modelo_unidad03.Viaje;

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
