/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author camper
 */
public class Principal {
    public static void main(String[] args) {
        Entrenamiento entrenamientoDelantero = new Delantero();
        Entrenamiento entrenamientoDefensor = new Defensor();
        Entrenamiento entrenamientoPortero = new Portero();

        entrenamientoDelantero.entrenar();
        entrenamientoDefensor.entrenar();
        entrenamientoPortero.entrenar();
    }
}
