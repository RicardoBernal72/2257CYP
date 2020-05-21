/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.abstracta;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kikis
 */
public class Pruebas {
    public static void main(String[] args) {
        Flauta f= new Flauta("Stevenson",1987);
        f.afinar();
        f.tocar();
        f.limpiar();
        System.out.println(f.obtenerTipoInstrumento());
        
        Guitarra g=new Guitarra("gibson",1230);
        g.afinar();
        g.tocar();
        System.out.println(g.obtenerTipoInstrumento());
        
        JFrame ventana = new JFrame("hola venta");
        ventana.setSize(600,400);
        ventana.getContentPane().add(new JButton("presioname!!!!!!!!"));
        ventana.setVisible(true);
        
    }
    
}
