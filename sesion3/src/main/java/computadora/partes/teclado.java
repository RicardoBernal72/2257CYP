/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora.partes;

/**
 *
 * @author kikis
 */
public class teclado {
    private int numroDeTeclas;
    private String marca;
    private String color;
    private boolean portatil;

    public teclado() {
    }

    public teclado(int numroDeTeclas, String marca, String color, boolean portatil) {
        this.numroDeTeclas = numroDeTeclas;
        this.marca = marca;
        this.color = color;
        this.portatil = portatil;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }

    public int getNumroDeTeclas() {
        return numroDeTeclas;
    }

    public void setNumroDeTeclas(int numroDeTeclas) {
        this.numroDeTeclas = numroDeTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
