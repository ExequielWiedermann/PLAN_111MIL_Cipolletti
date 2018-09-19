/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.personas;

import poo.categoria.Categoria;

/**
 *
 * @author ewiedermann
 */
public class Persona {
    
    public void Categoria(){
        //Genero la creación del objeto
        Categoria categoria = new Categoria();
        categoria.Enviar();
    }
    
    private String nombreApellido;
    
    private String domicilio;
    
    private String tipoDoc;
    
    private int documentoNacional;
    
    private String fechaNacimiento;

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumentoNacional() {
        return documentoNacional;
    }

    public void setDocumentoNacional(int documentoNacional) {
        this.documentoNacional = documentoNacional;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombreApellido, String domicilio, String tipoDoc, int documentoNacional, String fechaNacimiento) {
        this.nombreApellido = nombreApellido;
        this.domicilio = domicilio;
        this.tipoDoc = tipoDoc;
        this.documentoNacional = documentoNacional;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}