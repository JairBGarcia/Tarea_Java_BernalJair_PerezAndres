/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author camper
 */
public class Main {
    public static void main(String[] args) {
        Balon balon = new Balon("Nike", 30.5, "Rojo");

        System.out.println("Marca del balon: " + balon.getMarca());
        System.out.println("Diámetro del balon: " + balon.getDiametro());
        System.out.println("Color del balon: " + balon.getColor());

        balon.inflar();
        System.out.println("¿El balon está inflado? " + balon.estaInflado());

        balon.desinflar();
        System.out.println("¿El balon está inflado? " + balon.estaInflado());
    }
}
