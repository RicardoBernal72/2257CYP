/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.abstracta;

/**
 *
 * @author kikis
 */
public class Guitarra extends Instrumento{
    private String marca;

    public Guitarra() {
    }

    public Guitarra(String marca, int anioFabricacion) {
        super(anioFabricacion);
        this.marca = marca;
    }
    

    @Override
    public void tocar() {
        System.out.println("con una mano toca la guitarra y con la otra altera el sonido");
    }

    @Override
    public void afinar() {
        System.out.println("afiando la guitarra");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String obtenerTipoInstrumento() {
        return "Instrumento de cuerda Guitarra";
    }
    
    
}
