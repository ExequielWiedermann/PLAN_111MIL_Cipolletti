/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.persona.usuario;

import poo.personas.Persona;

/**
 *
 * @author ewiedermann
 */
public class Usuario extends Persona{
 

 
    private String nombreContrasenia;

    public Usuario(String nombreApellido, String domicilio, String tipoDoc, int documentoNacional, String fechaNacimiento) {
        super(nombreApellido, domicilio, tipoDoc, documentoNacional, fechaNacimiento);
    }
    
    public String getNombreContrasenia() {
        return nombreContrasenia;
    }

    public void setNombreContrasenia(String nombreContrasenia) {
        this.nombreContrasenia = nombreContrasenia;
    }

    public Usuario(String nombreContrasenia, String nombreApellido, String domicilio, String tipoDoc, int documentoNacional, String fechaNacimiento) {
        super(nombreApellido, domicilio, tipoDoc, documentoNacional, fechaNacimiento);
        this.nombreContrasenia = nombreContrasenia;
    }


    
    
}
