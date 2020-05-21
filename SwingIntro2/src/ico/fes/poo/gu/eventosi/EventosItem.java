/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gu.eventosi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

/**
 *
 * @author kikis
 */
public class EventosItem implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("evento realizado");
        JComboBox com=(JComboBox)ae.getSource();
        System.out.println("seleccionado: "+com.getSelectedItem());
    }

    
    
}
