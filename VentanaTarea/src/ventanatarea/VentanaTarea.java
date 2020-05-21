/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanatarea;

import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author kikis
 */
public class VentanaTarea extends Frame {
    Button boton1;
    public VentanaTarea(){
        super("Mi primer ventana AWT");
        setSize(600,340);
        boton1=new Button("Boton1");
        add (boton1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaTarea principal=new VentanaTarea();
        principal.setSize(400, 300);
        principal.setVisible(true);
        
        Ventana2 v=new Ventana2();
        v.setSize(400, 300);
        v.setVisible(true);
        
        Ventana3 v1=new Ventana3();
        v1.setSize(400, 300);
        v1.setVisible(true);
        
        Ventana4 v2=new Ventana4();
        v2.setSize(400, 300);
        v2.setVisible(true);
        //EL ultimo layout, el de GridbagLayout no lo lee, por lo que lo dejo comentado.
        //Ventana5 v3=new Ventana5();
        //v3.setSize(400, 300);
        //v3.setVisible(true);
    }
    
}
