/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.vehiculo;

import java.util.Set;
import poo.categoria.Categoria;

/**
 *
 * @author ewiedermann
 */
public class Vehiculo {
    private String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private Set<Categoria> categoria;
}
