/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modularidad;

/**
 *
 * @author jairb
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Suma: " + Operaciones.suma(num1, num2));
        System.out.println("Resta: " + Operaciones.resta(num1, num2));
        System.out.println("Multiplicacion: " + Operaciones.multiplicacion(num1, num2));

        try {
            System.out.println("Division: " + Operaciones.division(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
