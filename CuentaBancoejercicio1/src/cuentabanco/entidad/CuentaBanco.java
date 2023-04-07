/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco.entidad;

/**
 *Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
 * numeroCuenta(entero), dniCliente(entero largo), saldoActual.
 * Agregar constructor vacío, con parámetros, getters y setters.

 * @author BeluS
 */
public class CuentaBanco {
    // atributos
    private int numeroCuenta;
    private long dniCliente;
    private double SaldoActual;
    
    //constructor

    public CuentaBanco(int numeroCuenta, long dniCliente, double SaldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.SaldoActual = SaldoActual;
    }

    public CuentaBanco() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
    
    
    
}
