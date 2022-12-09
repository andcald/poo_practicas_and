/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_0303;

import java.time.LocalDate;

/**
 *
 * @author kevinandres
 */
public class Departamento {
    

    private String nombreDepartamento;
    private int codigo;

    public Departamento(String nombreDepartamento, int codigo) {
        this.nombreDepartamento = nombreDepartamento;
        this.codigo = codigo;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombreDepartamento=" + nombreDepartamento + ", codigo=" + codigo + '}';
    }
    


    
}
