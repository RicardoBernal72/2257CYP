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
public class mouse {
    private String marca;
    private boolean inalambrico;
    private int DPI;
    private String color;

    public mouse() {
    }

    public mouse(String marca, boolean inalambrico, int DPI, String color) {
        this.marca = marca;
        this.inalambrico = inalambrico;
        this.DPI = DPI;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }
    
    
}
