/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.events;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author kikis
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Touch");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("soltar");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("entrar");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("exitado  exit");
    }
    
}
