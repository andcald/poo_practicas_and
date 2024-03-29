/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0301_servicio;

import java.util.List;
import poo_0301_modelo.Personaje;

/**
 *
 * @author kevinandres
 */
public interface PersonajeServicio{

    public abstract void crear(Personaje personaje);

    public abstract void modificar(int codigo, Personaje personajeModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Personaje> listar();

}
