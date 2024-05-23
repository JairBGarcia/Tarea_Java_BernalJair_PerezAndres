
package Herencia;


public class Profesor extends Persona
{
    String materia;

    public Profesor() 
    {
        
    }

    public Profesor(String nombre,String documento,int edad,String materia) 
    {
        super(nombre, documento, edad);
        this.materia = materia;
    }

    public String getMateria() 
    {
        return materia;
    }

    public void setMateria(String materia) 
    {
        this.materia = materia;
    }
    
    @Override
    public String mostrarDatos()
    {
        return
                super.mostrarDatos()
                +"|Materia: "+getMateria()+"|"
        ;
    }
    
    
    
}
