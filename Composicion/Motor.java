/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion;

/**
 *
 * @author jairb
 */
public class Motor {
    private int cilindros;

    public Motor(int cilindros) {
        this.cilindros = cilindros;
    }

    public void encender() {
        System.out.println("El motor se ha encendido");
    }

    public void apagar() {
        System.out.println("El motor se ha apagado");
    }
}

