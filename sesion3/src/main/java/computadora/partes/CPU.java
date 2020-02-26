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
public class CPU {
    private String modelo;
    private String marca;
    private String color;
    private int cpu;

    public CPU() {
    }

    public CPU(String modelo, String marca, String color, int cpu) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.cpu = cpu;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
