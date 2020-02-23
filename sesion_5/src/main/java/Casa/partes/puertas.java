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
public class puertas {
    private String tamaño;
    private String material;
    private String color;
    private boolean ventanas;

    public puertas() {
    }

    public puertas(String tamaño, String material, String color, boolean ventanas) {
        this.tamaño = tamaño;
        this.material = material;
        this.color = color;
        this.ventanas = ventanas;
    }

    public boolean isVentanas() {
        return ventanas;
    }

    public void setVentanas(boolean ventanas) {
        this.ventanas = ventanas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
