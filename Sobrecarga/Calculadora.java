/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author jairb
 */
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public String concatenar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); 
        System.out.println("La suma es: " + calculadora.sumar(5, 3)); 
    }
}
