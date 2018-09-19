/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.laptop;

import poo.laptop.keyboard.KeyBoard;

/**
 *
 * @author ewiedermann
 */
public class Laptop {

    private String manufacturer;
    private String model;
    private String serviceTag;
    private KeyBoard keyBoard = new KeyBoard();


    public Laptop(String manufacturer, String model, String serviceTag) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.serviceTag = serviceTag;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }
}
