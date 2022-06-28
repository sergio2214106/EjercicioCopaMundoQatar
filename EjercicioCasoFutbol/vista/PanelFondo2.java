package vista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;


public class PanelFondo2 extends JPanel
{
    //------------------------
    //Atributos
    //------------------------

    private JLabel lbtitulo;
    private Color colorQatar1= new Color(52, 122, 253);
    private Font fuente= new Font("Monospaced", java.awt.Font.BOLD, 30);
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelFondo2()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(colorQatar1);
        
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbtitulo = new JLabel("APLICACION MUNDIAL QATAR 2022");
        lbtitulo.setBounds(200,5,1000,25);
        lbtitulo.setFont(fuente);
        add(lbtitulo);
       
    }
}