/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtintro;

import ico.fes.poo.gui.Ventana;

/**
 *
 * @author kikis
 */
public class AwtIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ventana v= new Ventana();
        v.setVisible(true);
        Ventana v2=new Ventana("hola Mundo ke hace en cuarentena o que ase",600,800);
        v2.setVisible(true);
        
    }
    
}
