/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.persona.main;

import java.util.ArrayList;
import poo.persona.empleado.Empleado;

/**
 *
 * @author ewiedermann
 */
public class PooPersona {

    public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Empleado empleadoWiedermann = new Empleado("Exequiel Wiedermann",
                "Lejos Lejos", "DNI", 
                33566726, "18/04/1988");
        
        empleados.add(empleadoWiedermann);
        
        System.out.println("El nombre del empleado es: " 
                + empleadoWiedermann.getNombreApellido());
        
    }
    
}
