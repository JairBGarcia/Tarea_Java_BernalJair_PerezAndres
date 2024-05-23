/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author analistasistemas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Profesor pro=new Profesor("Sergio Delgado","100521131",19,"Bases de datos");
        Estudiante est=new Estudiante("Joel Delgado","1102644322",12,"Ingenieria de sistemas");
        
        String datosPro=pro.mostrarDatos();
        String datosEst=est.mostrarDatos();
        
        System.out.println(datosPro);
        System.out.println(datosEst);
        
    }
    
}
