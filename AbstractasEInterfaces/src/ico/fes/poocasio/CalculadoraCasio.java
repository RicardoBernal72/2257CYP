/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poocasio;

import ico.fes.poo.Aritmetica;

/**
 *
 * @author kikis
 */
public class CalculadoraCasio implements Aritmetica {

    @Override
    public float sumar(float a, float b) {
        return a+b;
    }

    @Override
    public float restar(float a, float b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float multiplicar(float a, float b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float dividir(float a, float b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
