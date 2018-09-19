/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.customer;

import poo.creditcard.CreditCard;

/**
 *
 * @author ewiedermann
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    //Instancia de Objetos de los datos de tarjeta
    private CreditCard creditCard;

    public Customer(int id, String firstName, String lastName, CreditCard creditCard) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    
 
}
