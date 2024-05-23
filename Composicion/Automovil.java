/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion;

/**
 *
 * @author jairb
 */
public class Automovil {
    private Motor motor;
    private Rueda[] ruedas;

    public Automovil(Motor motor, int cantidadRuedas) {
        this.motor = motor;
        this.ruedas = new Rueda[cantidadRuedas];
        for (int i = 0; i < cantidadRuedas; i++) {
            this.ruedas[i] = new Rueda(16); 
        }
    }

    public void arrancar() {
        motor.encender();
        for (Rueda rueda : ruedas) {
            rueda.rodar();
        }
        System.out.println("El automovil ha arrancado");
    }

    public void apagar() {
        motor.apagar();
        System.out.println("El automovil se ha apagado");
    }
}

