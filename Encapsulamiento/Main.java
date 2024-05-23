/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author jairb
 */
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000); // Esto debería imprimir "Fondos insuficientes o cantidad inválida"

        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}
