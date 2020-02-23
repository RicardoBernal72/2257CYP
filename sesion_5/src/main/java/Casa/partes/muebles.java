/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa.partes;

/**
 *
 * @author kikis
 */
public class muebles {
    private String forma;
    private String utilidad;
    private String Tamaño;
    private String material;
    private String color;

    public muebles() {
    }

    public muebles(String forma, String utilidad, String Tamaño, String material, String color) {
        this.forma = forma;
        this.utilidad = utilidad;
        this.Tamaño = Tamaño;
        this.material = material;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
