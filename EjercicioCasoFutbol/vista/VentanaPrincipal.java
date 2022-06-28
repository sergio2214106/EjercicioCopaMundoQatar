package vista;

import javax.swing.JFrame;

import java.awt.Color;
public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelFondo1 miPanelFondo1;
    public PanelFondo2 miPanelFondo2;
    public PanelFondo3 miPanelFondo3;
    public PanelFondo4 miPanelFondo4;
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public DialogoPaises miDialogoPaises;
    public SubDialogoPaises miSubDialogoPaises;
    public SubDialogoPaisesPais miSubDialogoPaisesPais;
    public SubDialogoPaisesTecnico miSubDialogoPaisesTecnico;
    public SubDialogoPaisesEquipo miSubDialogoPaisesEquipo;
    public SubSubDialogoAñadir miSubSubDialogoAñadir;

    public Color colorQatar2= new Color(52, 122, 253);

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //Creación y adición del PanelFondo
        miPanelFondo3 = new PanelFondo3();
        miPanelFondo3.setBounds(25,30,25,720);
        add(miPanelFondo3);
        
        //Creación y adición del PanelFondo
        miPanelFondo4 = new PanelFondo4();
        miPanelFondo4.setBounds(25,30,1080,20);
        add(miPanelFondo4);

        
        //Creación y adición del PanelFondo
        miPanelFondo1 = new PanelFondo1();
        miPanelFondo1.setBounds(0,0,50,720);
        add(miPanelFondo1);

        //Creación y adición del PanelFondo
        miPanelFondo2 = new PanelFondo2();
        miPanelFondo2.setBounds(0,0,1080,50);
        add(miPanelFondo2);
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(50,50,1000,355);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(50,405,1000,265);
        add(miPanelOperaciones);
        
        miDialogoPaises = null;
        
        //Caracteristicas de la ventana
        setTitle("Carro");
        setSize(1080,720);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    //Crear ventana dialogo Mover
    public void crearDialogoPaises()
    {
        miDialogoPaises = new DialogoPaises();
    }
    public void crearSubDialogoPaises()
    {
        miSubDialogoPaises = new SubDialogoPaises();
    }
    public void crearSubDialogoPaisesPais()
    {
        miSubDialogoPaisesPais = new SubDialogoPaisesPais();
    }
    public void crearSubDialogoPaisesTecnico()
    {
        miSubDialogoPaisesTecnico = new SubDialogoPaisesTecnico();
    }
    public void crearSubDialogoPaisesEquipo()
    {
        miSubDialogoPaisesEquipo = new SubDialogoPaisesEquipo();
    }
    public void crearSubSubDialogoAñadir()
    {
        miSubSubDialogoAñadir = new SubSubDialogoAñadir();
    }
    public void cerrarDialogo()
    {
        this.dispose();
    }  
}