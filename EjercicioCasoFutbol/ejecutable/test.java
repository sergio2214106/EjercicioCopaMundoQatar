package ejecutable;

import modelo.Equipo;
import modelo.Jugador;
import vista.VentanaPrincipal;
import controlador.Controlador;

public class test {
    public static void main(String[] args)
    {
        Equipo Equipo1 = new Equipo("sergio",1);
        Jugador Jugador1 = new Jugador("Cristiano", 18,21, "defensa");
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana, Equipo1);
    }
    
}
