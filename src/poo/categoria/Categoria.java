/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.categoria;

import poo.vehiculo.Vehiculo;

/**
 *
 * @author ewiedermann
 */
public class Categoria {
    public int Id;

    public String nombreCategoria;

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public void Enviar(){
        
    }
    
    //La clase A
    private Vehiculo vehiculo;
}
