/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.events.EventosRaton;
import ico.fes.poo.gui.events.EventosTexto;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author kikis
 */
public class Ventana extends Frame {

    private Button boton1;
    private TextField texto1;
    private TextArea textArea;

    public Ventana() throws HeadlessException {
        super("HOLA Mundo");
        super.setSize(400, 600);
        super.setLayout(new FlowLayout());
        boton1 = new Button("Aceptar");
        texto1 = new TextField(10);
        textArea = new TextArea(5, 15);
        this.add(texto1);
        this.add(boton1);
        this.add(textArea);
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                String entrada = texto1.getText();
                textArea.setText(entrada);
            }

        });
        boton1.addMouseListener(new EventosRaton());
        texto1.addKeyListener(new EventosTexto());
        texto1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                System.out.println("texto actual: " + texto1.getText());
            }

        });
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
