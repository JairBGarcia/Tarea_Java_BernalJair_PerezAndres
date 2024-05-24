/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composicion;

/**
 *
 * @author jairb
 */
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(4);
        Automovil automovil = new Automovil(motor, 4); 

        automovil.arrancar();

        automovil.apagar();
    }
}

