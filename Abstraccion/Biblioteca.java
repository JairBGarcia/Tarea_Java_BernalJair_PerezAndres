/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author jairb
 */

public class Biblioteca {
    public void prestarLibro(Libro libro, Usuario usuario) {
        System.out.println("Se ha prestado el libro \"" + libro.getTitulo() + "\" a " + usuario.getNombre());
    }

    public void devolverLibro(Libro libro) {
        System.out.println("Se ha devuelto el libro \"" + libro.getTitulo() + "\" a la biblioteca");
    }
}
