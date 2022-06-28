package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Equipo;
///import modelo.Jugador;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Equipo model;
    int n=0;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Equipo pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        
        if(comando.equals("consultar"))
        {   
            venPrin.crearDialogoPaises();
            this.venPrin.miDialogoPaises.agregarOyentesBotones(this); 
        }
        
        if(comando.equals("salir"))
        {
            System.exit(0);
        }


        if(comando.equals("listo"))
        {
            venPrin.miDialogoPaises.cerrarDialogo();
            venPrin.setVisible(true); 
        }
        if(comando.equals("listo2"))
        {
            venPrin.miSubDialogoPaisesTecnico.cerrarDialogo();
        }
        if(comando.equals("listo3"))
        {
            venPrin.miSubDialogoPaisesEquipo.cerrarDialogo();
        }
        if(comando.equals("listo4"))
        {
            venPrin.miSubDialogoPaisesPais.cerrarDialogo();
        }
        if(comando.equals("listo5"))
        {
            venPrin.miSubSubDialogoAñadir.cerrarDialogo();
        }
        if(comando.equals("info"))
        {
           venPrin.miDialogoPaises.getlSeleccionPaises();
           venPrin.crearSubDialogoPaises();
           this.venPrin.miSubDialogoPaises.agregarOyentesBotones(this);  
        }
        if(comando.equals("infoTecnico"))
        {
            venPrin.crearSubDialogoPaisesTecnico();
            venPrin.miSubDialogoPaisesTecnico.txtNombreContinente.setText("");
            venPrin.miSubDialogoPaisesTecnico.txtNumParticipaciones.setText("");
            venPrin.miSubDialogoPaisesTecnico.txtVictoriasCopa.setText("");
            this.venPrin.miSubDialogoPaisesTecnico.agregarOyentesBotones(this);
        }
        if(comando.equals("infoPais"))
        {
            venPrin.crearSubDialogoPaisesPais();
            venPrin.miSubDialogoPaisesPais.txtNombreContinente.setText("");
            venPrin.miSubDialogoPaisesPais.txtNumParticipaciones.setText("");
            venPrin.miSubDialogoPaisesPais.txtVictoriasCopa.setText("");
            this.venPrin.miSubDialogoPaisesPais.agregarOyentesBotones(this);
            for(int i=0; i<33;i++)
            {
                if(venPrin.miDialogoPaises.getlSeleccionPaises().equals(venPrin.miDialogoPaises.listaPaises[i]))
                {
                    venPrin.miSubDialogoPaisesPais.lblNumeroPaises.setText(venPrin.miDialogoPaises.listaPaises[i]);
                }
            }

        }
        if(comando.equals("infoEquipo"))
        {
            venPrin.crearSubDialogoPaisesEquipo();
            this.venPrin.miSubDialogoPaisesEquipo.agregarOyentesBotones(this);

        }
        if(comando.equals("atras"))
        {
            venPrin.miSubDialogoPaises.cerrarDialogo();
        }
        if(comando.equals("añadir"))
        {
            venPrin.crearSubSubDialogoAñadir();
            venPrin.miSubSubDialogoAñadir.txtNombre.setText("");
            venPrin.miSubSubDialogoAñadir.txtPosicion.setText("");
            venPrin.miSubSubDialogoAñadir.txtEdad.setText("");
            venPrin.miSubSubDialogoAñadir.txtNumGoles.setText("");
            this.venPrin.miSubSubDialogoAñadir.agregarOyentesBotones(this);
        }
        if(comando.equals("añadirPrincipal"))
        {

            //venPrin.miSubDialogoPaisesEquipo.listaPrincipales[n].concat(venPrin.miSubSubDialogoAñadir.getNombre());
            venPrin.miSubDialogoPaisesEquipo.seleccionPrincipales.removeItemAt(n);
            venPrin.miSubDialogoPaisesEquipo.seleccionPrincipales.insertItemAt(venPrin.miSubSubDialogoAñadir.getNombre(), n);
            venPrin.miSubDialogoPaisesEquipo.seleccionPrincipales.setSelectedIndex(n);
            //venPrin.miSubDialogoPaisesEquipo.add(venPrin.miSubDialogoPaisesEquipo.seleccionPrincipales);
    
            n++;
        }
        if(comando.equals("añadirSuplente"))
        {
            venPrin.miSubDialogoPaisesEquipo.seleccionSuplentes.removeItemAt(n);
            venPrin.miSubDialogoPaisesEquipo.seleccionSuplentes.insertItemAt(venPrin.miSubSubDialogoAñadir.getNombre(), n);
            venPrin.miSubDialogoPaisesEquipo.seleccionSuplentes.setSelectedIndex(n);
        }    
    }
}