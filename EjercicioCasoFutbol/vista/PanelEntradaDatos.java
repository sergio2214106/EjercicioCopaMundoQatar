package vista;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.AffineTransform;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen1;
    private ImageIcon iImagen1;
    private JLabel lbImagen2;
    private ImageIcon iImagen2;
    private JLabel label1;
    private Color colorQatar1= new Color(126, 23, 59);
    private Font fuente= new Font("Monospaced", java.awt.Font.BOLD, 25);
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(colorQatar1);
        
        //Creación y adicion de la imagen
        iImagen1 = new ImageIcon(getClass().getResource("/vista/carro.png"));
        lbImagen1 = new JLabel(iImagen1);
        lbImagen1.setBounds(60,80,240,246);
        add(lbImagen1);

        //Creación y adicion de la imagen
        iImagen2 = new ImageIcon(getClass().getResource("/vista/equipos.png"));
        lbImagen2 = new JLabel(iImagen2);
        lbImagen2.setBounds(450,50,520,296);
        add(lbImagen2);

        label1 = new JLabel("FASE DE GRUPOS");
            label1.setBounds(600,25,500,25);
            label1.setForeground(Color.WHITE);
            label1.setFont(fuente);
            add(label1);
    }

}