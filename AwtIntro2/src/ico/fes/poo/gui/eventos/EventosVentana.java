/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author kikis
 */
public class EventosVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Ev Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Ev Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Eve Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Evento WindowIconified");
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Event WindowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Event WindowDeactivated");
    }
    
}
