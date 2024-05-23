/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author jairb
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Don Quijote de la Mancha");
        Libro libro2 = new Libro("Hamlet");

        Usuario usuario = new Usuario("Juan");

        biblioteca.prestarLibro(libro1, usuario);

        biblioteca.devolverLibro(libro1);
    }
}



