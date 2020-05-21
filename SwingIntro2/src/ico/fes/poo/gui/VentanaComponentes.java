/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gu.eventosi.EventosItem;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kikis
 */
public class VentanaComponentes extends JFrame {

    private JButton b1;
    private JTextField entrada;
    private JButton btnArch;
    private JComboBox combo;
    private JLabel etiqueta;
    private JTextArea area;

    public VentanaComponentes() throws HeadlessException {
        super("elementos swing");
        super.setSize(400, 600);
        super.getContentPane().setLayout(new FlowLayout());
        b1 = new JButton("Salud");
        entrada = new JTextField(20);
        btnArch=new JButton("Elige tu archivo");
        String [] frutas ={"limón", "piña", "Kiwi", "naranja"};
        combo=new JComboBox(frutas);
        etiqueta=new JLabel("hola");
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.yellow);
        etiqueta.setForeground(new Color(200, 30, 120));
        area =new JTextArea(3,10);
        
        super.getContentPane().add(b1);
        super.getContentPane().add(entrada);
        super.getContentPane().add(btnArch);
        super.getContentPane().add(combo);
        super.getContentPane().add(etiqueta);
        
        
        combo.addActionListener(new EventosItem());
        
     
        btnArch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                JFileChooser jfc=new JFileChooser();
                jfc.showOpenDialog(null);
                File archivo= jfc.getSelectedFile();
                System.out.println("La ruta es"+archivo.getAbsolutePath());
            }
            
});

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int resp = JOptionPane.showConfirmDialog(null, "¿continuar?","Pregunt o responde",
                        JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    System.out.println("Dijiste sis");
                }
                if (resp == JOptionPane.NO_OPTION) {
                    System.out.println("Dijiste Nel");
                }
                if (resp == JOptionPane.CANCEL_OPTION) {
                    System.out.println("Dijiste queso");
                }
                String entrada = JOptionPane.showInputDialog(null,"introduce un nombre","Efe",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null,entrada.toUpperCase());
                
                
                }

            }

            );
    super.addWindowListener(
             
        new WindowAdapter() {
        @Override
        public void windowClosing
        (WindowEvent we
                
        
            ) {
            System.exit(0);
        }

    }

);

    }
}
