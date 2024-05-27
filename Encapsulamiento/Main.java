/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author camper
 */
public class JavaApplication4 {
    private String marca;
    private double diametro;
    private String color;
    private boolean inflado;

    public JavaApplication4(String marca, double diametro, String color) {
        this.marca = marca;
        this.diametro = diametro;
        this.color = color;
        this.inflado = false; 
    }

    public String getMarca() {
        return marca;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getColor() {
        return color;
    }

    public void inflar() {
        this.inflado = true;
    }

    public void desinflar() {
        this.inflado = false;
    }

    public boolean estaInflado() {
        return inflado;
    }

    public static void main(String[] args) {
        JavaApplication4 balon = new JavaApplication4("Nike", 30.5, "Rojo");

        System.out.println("Marca del balon: " + balon.getMarca());
        System.out.println("Diámetro del balon: " + balon.getDiametro());
        System.out.println("Color del balon: " + balon.getColor());

        balon.inflar();
        System.out.println("¿El balon está inflado? " + balon.estaInflado());

        balon.desinflar();
        System.out.println("¿El balon está inflado? " + balon.estaInflado());
    }
}
