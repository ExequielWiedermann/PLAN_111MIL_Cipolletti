/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.creditcard;

/**
 *
 * @author ewiedermann
 */
public class CreditCard {
    private int numeroTarjeta;
    private String fechaVencimiento;
    private String codigoDeSeguridad;
    private String fechaCreacion;

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    

    public CreditCard(int numeroTarjeta, String fechaVencimiento, String codigoDeSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    
    
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public void setCodigoDeSeguridad(String codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }
    
    
}
