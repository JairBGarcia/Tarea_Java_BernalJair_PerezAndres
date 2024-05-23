/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author jairb
 */
public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido(); 
        gato.hacerSonido();  
    }
}

