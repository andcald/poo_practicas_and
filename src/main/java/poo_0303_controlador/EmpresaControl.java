/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_controlador;

/**
 *
 * @author karly
 */
import java.time.LocalDate;
import java.util.List;
import poo_0303_modelo.Empresa;
import poo_0303_servicio.EmpresaServiceImpl;
import poo_0303_vista.VentanaEmpresa;

/**
 *
 * @author kevinandres
 */
public class EmpresaControl {

    private EmpresaServiceImpl empresaServiceImpl;
   

    public EmpresaControl() {
        this.empresaServiceImpl = new EmpresaServiceImpl();
       

    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear la empresa";

        var nombre = data[1];
        var codigo = Integer.valueOf(data[1]).intValue();
        var duenio = data[2];
        var anio = Integer.valueOf(data[3]).intValue();
        var mes = Integer.valueOf(data[4]).intValue();
        var dia = Integer.valueOf(data[5]).intValue();

        if (anio < 1980 && mes > 12 && dia > 31) {
            retorno += " La fecha de nacimiento es incorrecta";
        } else {
            var empresa = new Empresa(nombre, codigo, duenio, LocalDate.of(anio, mes, dia));
          
            this.empresaServiceImpl.crear(empresa);

            retorno = "Empresa " + empresa.getNombreEmpresa()
                    + " creado correctamente";

        }
        return retorno;

    }
    
    

    public List<Empresa> listar() {
        
        
        
        
        return this.empresaServiceImpl.listar();
        
        
        
    }

}
