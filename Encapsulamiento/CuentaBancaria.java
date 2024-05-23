/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author jairb
 */
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Se ha depositado " + cantidad + " dolares");
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " dolares");
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

