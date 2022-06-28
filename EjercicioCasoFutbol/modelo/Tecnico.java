package modelo;

public class Tecnico { //Atributos
    private String nombre;
    private int edad;
    private int experiencia;

    //Métodos
    public Tecnico()
    {
        nombre = "";
        edad= 0;
        experiencia=0;
    }

    public Tecnico(String n, int exp, int e)
    {
        nombre = n;
        experiencia = exp;
        edad = e;
    }
    
    public void setExperiencia(int exp)
    {
        experiencia = exp;
    }

    public int getExperiencia()
    {
        return experiencia;
    }
    public void setEdad(int e)
    {
        edad = e;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNombre(String n)
    {
        nombre = n;
    }

    public String getNombre()
    {
        return nombre;
    }
}
    
