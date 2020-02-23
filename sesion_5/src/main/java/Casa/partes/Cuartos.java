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
public class Cuartos {
    private int numVentanas;
    private float tamañoDeLaParedEnMetrosCuadrados;
    private String materialDePiso;
    private int numDePiso;

    public Cuartos() {
    }

    public Cuartos(int numVentanas, float tamañoDeLaParedEnMetrosCuadrados, String materialDePiso, int numDePiso) {
        this.numVentanas = numVentanas;
        this.tamañoDeLaParedEnMetrosCuadrados = tamañoDeLaParedEnMetrosCuadrados;
        this.materialDePiso = materialDePiso;
        this.numDePiso = numDePiso;
    }

    public int getNumDePiso() {
        return numDePiso;
    }

    public void setNumDePiso(int numDePiso) {
        this.numDePiso = numDePiso;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public float getTamañoDeLaParedEnMetrosCuadrados() {
        return tamañoDeLaParedEnMetrosCuadrados;
    }

    public void setTamañoDeLaParedEnMetrosCuadrados(float tamañoDeLaParedEnMetrosCuadrados) {
        this.tamañoDeLaParedEnMetrosCuadrados = tamañoDeLaParedEnMetrosCuadrados;
    }

    public String getMaterialDePiso() {
        return materialDePiso;
    }

    public void setMaterialDePiso(String materialDePiso) {
        this.materialDePiso = materialDePiso;
    }
    
    
            
    
}
