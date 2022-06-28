package modelo;

import javax.swing.JOptionPane;

public class Equipo
{
    //Atributos
    private String nombreEquipo;
    private int numJugadores;
    private Jugador[] jugadoresPrincipales;
    private Jugador[] jugadoresSuplentes;
    private String nGoleador;
    private int golesGoleador;
    private int edadesProm;

    //Metodos
    public Equipo(String nom, int n)
    {
        nombreEquipo = nom;
        jugadoresPrincipales = new Jugador[11];
        jugadoresSuplentes = new Jugador[11];
    }

    public void cargar()
    {
        for(int i=0; i< numJugadores;i++)
        {
            jugadoresPrincipales[i] = crearJugador("",0,0,"");
        }
    }

    public Jugador crearJugador(String n, int g, int e, String p)
    {
        String nom = n;
        int goles = g;
        int edad = e;
        String posicion= p;
        //nom = JOptionPane.showInputDialog("Nombre del jugador: ");
        //goles = Integer.parseInt(JOptionPane.showInputDialog("Goles del jugador: "));
        //edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del jugador: "));
        //posicion = (JOptionPane.showInputDialog("Codigo del jugador: "));
        return new Jugador(nom, goles, edad, posicion);
    }

    /*public int calcularTotalGoles()
    {
        int totalGolesEquipo = 0;
        for(int i=0; i<numJugadores; i++)
        {
            totalGolesEquipo += jugadoresPrincipales[i].getGoles();
            if(jugadoresPrincipales[i].getGoles() > golesGoleador)
            {
                golesGoleador = jugadoresPrincipales[i].getGoles();
                nGoleador = jugadoresPrincipales[i].getNombre();
            }
        }
        return totalGolesEquipo;
    }*/
    public int calcularMayorGoles()
    {
        for(int i=0; i<numJugadores; i++)
        {
            if(jugadoresPrincipales[i].getGoles() > golesGoleador)
            {
                golesGoleador = jugadoresPrincipales[i].getGoles();

            }
            if(jugadoresSuplentes[i].getGoles() > golesGoleador)
            {
                golesGoleador = jugadoresSuplentes[i].getGoles();

            }
            //if(jugadores[i].getCodigo() ==21)
        //{
           // jugadores[i].getGoles(g) += 5;
        //}
        }
        

        return golesGoleador;
    }
    public String calcularGoleador()
    {
        for(int i=0; i<numJugadores; i++)
        {
            if(jugadoresPrincipales[i].getGoles() > golesGoleador)
            {
                golesGoleador = jugadoresPrincipales[i].getGoles();
                nGoleador = jugadoresPrincipales[i].getNombre();
            }
        }
        return nGoleador;
    }
    public int calcularPromedioEdades()
    {
        for(int i=0; i<numJugadores; i++)
        {     
            edadesProm += jugadoresPrincipales[i].getEdad();
        }
        edadesProm= edadesProm/numJugadores;
        return edadesProm;
    }
    public int imprimirJugadores()
    {
        String nom;
        int goles;
        int edad;
        int codigo;
        String impresionJugador;
        String impresionEquipoJugadores;

        for(int i=0; i<numJugadores; i++)
        {     
            


        }
        
        return edadesProm;
    }


}
