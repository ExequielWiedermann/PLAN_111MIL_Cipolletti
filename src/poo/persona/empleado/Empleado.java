/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.persona.empleado;

import poo.personas.Persona;

/**
 *
 * @author ewiedermann
 */
public class Empleado extends Persona{

    public Empleado(String numeroEmpleado, String nombreApellido, String domicilio, String tipoDoc, int documentoNacional, String fechaNacimiento) {
        super(nombreApellido, domicilio, tipoDoc, documentoNacional, fechaNacimiento);
        this.numeroEmpleado = numeroEmpleado;
    }
    
    
    private String numeroEmpleado;

    public Empleado(String nombreApellido, String domicilio, String tipoDoc, int documentoNacional, String fechaNacimiento) {
        super(nombreApellido, domicilio, tipoDoc, documentoNacional, fechaNacimiento);
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }    
}
