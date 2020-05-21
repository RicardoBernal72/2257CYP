/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarraylist.base;

/**
 *
 * @author kikis
 */
public class Empleado {
    private String nombre;
    private String departamento;
    private int sueldoDiario;
    private int diasTrabajados;
    private int horasExtras;
    private int sueldoMensual;

    public Empleado() {
    }

    public Empleado(String nombre, String departamento, int sueldoDiario, int diasTrabajados, int horasExtras, int sueldoMensual) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
        this.horasExtras = horasExtras;
        this.sueldoMensual = sueldoMensual;
    }

    public int getHorasextras() {
        return horasExtras;
    }

    public void setHorasextras(int horasextras) {
        this.horasExtras = horasextras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(int sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    
}
