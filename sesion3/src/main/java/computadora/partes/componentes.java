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
public class componentes {
    private mouse mouse;
    private CPU cpu;
    private teclado teclado;

    public componentes() {
    }

    public componentes(mouse mouse, CPU cpu, teclado teclado) {
        this.mouse = mouse;
        this.cpu = cpu;
        this.teclado = teclado;
    }

    public teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(teclado teclado) {
        this.teclado = teclado;
    }

    public mouse getMouse() {
        return mouse;
    }

    public void setMouse(mouse mouse) {
        this.mouse = mouse;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
    
}
