/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modularidad;

/**
 *
 * @author camper
 */



public class Silla {
    private String material;
    private String color;

    public Silla(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void mostrarDetalles() {
        System.out.println("Silla: Material - " + material + ", Color - " + color);
    }
}


