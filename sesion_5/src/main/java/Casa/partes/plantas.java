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
public class plantas {
    private String tipoDePlanta;
    private String tamaño;
    private boolean flores;
    private int cantidadDePlantas;

    public plantas() {
    }

    public plantas(String tipoDePlanta, String tamaño, boolean flores, int cantidadDePlantas) {
        this.tipoDePlanta = tipoDePlanta;
        this.tamaño = tamaño;
        this.flores = flores;
        this.cantidadDePlantas = cantidadDePlantas;
    }

    public int getCantidadDePlantas() {
        return cantidadDePlantas;
    }

    public void setCantidadDePlantas(int cantidadDePlantas) {
        this.cantidadDePlantas = cantidadDePlantas;
    }

    public String getTipoDePlanta() {
        return tipoDePlanta;
    }

    public void setTipoDePlanta(String tipoDePlanta) {
        this.tipoDePlanta = tipoDePlanta;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isFlores() {
        return flores;
    }

    public void setFlores(boolean flores) {
        this.flores = flores;
    }
    
    
}
