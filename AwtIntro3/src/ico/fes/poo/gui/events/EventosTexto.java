/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author kikis
 */
public class EventosTexto implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
        System.out.println("presionada tecla: "+ke.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}
