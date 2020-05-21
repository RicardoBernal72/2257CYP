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
public class Flauta extends Instrumento{
    private String marca;

    public Flauta(String marca) {
        this.marca = marca;
    }
    

    public Flauta() {
    }

    public Flauta(String marca, int anioFabricacion) {
        super(anioFabricacion);
        this.marca = marca;
    }
    

    @Override
    public void tocar() {
        System.out.println("Posicionar los dedos en los huecos y soplar");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando");
    }
    public void limpiar(){
        System.out.println("Limpiando");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String obtenerTipoInstrumento() {
        return "Instrumento de musica es una flauta";
    }
    
}
