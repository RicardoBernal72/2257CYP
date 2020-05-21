/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanatarea;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author kikis
 */
public class Ventana4 extends Frame{
    Button btn=new Button("DE tin");
    Button btn2=new Button("Marin");
    Button btn3=new Button("De do");
    Button btn4=new Button("Pingüe");
    
    public Ventana4(){
        super("Ventana con events");
        setSize(400,300);
        setResizable(false);
        setLayout(new GridLayout(3,2));
        add(btn);
        add(btn2);
        add(btn3);
        add(btn4);
        
        addWindowListener(
                new WindowAdapter(){
                    public void windoClosing(WindowEvent e){
                        System.exit(0);
                    }
                }
        );
    }
    
}
