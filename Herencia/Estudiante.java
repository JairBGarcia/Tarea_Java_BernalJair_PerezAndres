
package Herencia;


public class Estudiante extends Persona
{
    String carrera;

    public Estudiante() 
    {
        
    }

    public Estudiante(String nombre, String documento, int edad,String carrera) 
    {
        super(nombre,documento,edad);
        this.carrera = carrera;
    }

    public String getCarrera() 
    {
        return carrera;
    }

    public void setCarrera(String carrera) 
    {
        this.carrera = carrera;
    }
    
    @Override
    public String mostrarDatos()
    {
        return
                super.mostrarDatos()
                +"|Carrera: "+getCarrera()+"|"
        ;
    }
    
}
