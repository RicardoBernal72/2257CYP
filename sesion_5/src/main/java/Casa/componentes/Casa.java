/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa.componentes;

import Casa.partes.muebles;
import Casa.partes.Cuartos;
import Casa.partes.plantas;
import Casa.partes.puertas;
/**
 *
 * @author kikis
 */
public class Casa {
    private Cuartos cuartos;
    private muebles forniture;
    private plantas decoracionFlora;
    private puertas puertas;

    public Casa() {
    }

    public Casa(Cuartos cuartos, muebles forniture, plantas decoracionFlora, puertas puertas) {
        this.cuartos = cuartos;
        this.forniture = forniture;
        this.decoracionFlora = decoracionFlora;
        this.puertas = puertas;
    }

    public puertas getPuertas() {
        return puertas;
    }

    public void setPuertas(puertas puertas) {
        this.puertas = puertas;
    }

    public Cuartos getCuartos() {
        return cuartos;
    }

    public void setCuartos(Cuartos cuartos) {
        this.cuartos = cuartos;
    }

    public muebles getForniture() {
        return forniture;
    }

    public void setForniture(muebles forniture) {
        this.forniture = forniture;
    }

    public plantas getDecoracionFlora() {
        return decoracionFlora;
    }

    public void setDecoracionFlora(plantas decoracionFlora) {
        this.decoracionFlora = decoracionFlora;
    }
    
    
   
    
}
