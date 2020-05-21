/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icco.fes;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kikis
 */
public class Ventaba1 extends JFrame {
    private JButton boton1;

    public Ventaba1() throws HeadlessException {
        this.setTitle("Primer Ventana Swing");
        this.setSize(400, 600);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando ventana");
                System. exit(0);
             
            }
       
        
                
});
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        boton1 = new JButton("Presioname");
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JOptionPane.showMessageDialog(null,"Hola desde Java" );
            }
            
});
        this.getContentPane().add(boton1);
       
    }
    
}
