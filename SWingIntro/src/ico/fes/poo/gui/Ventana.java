/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kikis
 */
public class Ventana extends JFrame {

    private JTextField text1;
    private JButton boton1;
    private JTextArea textA;
    
    public Ventana() throws HeadlessException {
        super("Ventana swing");
        setSize(400, 600);
        this.getContentPane().setLayout(new FlowLayout());
        text1 = new JTextField(10);
        boton1 = new JButton("Acpetar");
        textA = new JTextArea(3, 10);
        textA.setBackground(Color.red);
        this.getContentPane().add(text1);
        this.getContentPane().add(boton1);
        this.getContentPane().add(textA);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("Cerrando beeepp");
                System.exit(0);
            }
            
        });
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                textA.setText(text1.getText());
                //JOptionPane.showInternalMessageDialog(null, "ola khe ace");
            }
            
});
        
    }
    
}
