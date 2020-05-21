/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.eventos.EventoGenerico;
import ico.fes.poo.gui.eventos.EventosRaton;
import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author kikis
 */
public class Ventana extends Frame{
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;

    public Ventana() throws HeadlessException {
    }

    public Ventana(int alto, int ancho, String string) throws HeadlessException {
        super(string);
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(this.ancho, this.alto);
        boton1=new Button("Touch ME");
        boton2=new Button("Touch Me Harder!!!!");
        setLayout(new FlowLayout());
        this.add(boton1);
        this.add(boton2);
        this.add(new Button("not becuse you are a rabbit"));
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(me); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Evento click ratón");
            }
            
        });
        
        boton1.addActionListener(new EventoGenerico());
        this.addWindowListener(new EventosVentana());
        boton2.addMouseListener(new EventosRaton());
        
        
        addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                    System.exit(0);
    }
                }
    );
   }
}
