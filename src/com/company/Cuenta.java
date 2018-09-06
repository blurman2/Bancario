package com.company;

public class Cuenta {
    //Atributos
    private Integer nroCuenta;
    private Double saldo = 0.0;
    private Cliente titular;

    //Constructor
    public Cuenta(Integer nroCuenta, Cliente titular) {
        this.nroCuenta = nroCuenta;
        this.titular = titular;
    }

    //Getters y Setters
    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //Responsabilidades
    public void depositar(Double monto){
        this.saldo = this.saldo + monto;
        System.out.println("El nuevo saldo es de: " + this.saldo);
    }

    public void extraer (Double monto){
        if (monto <= saldo){
            saldo = saldo - monto;
            System.out.println("El nuevo saldo es de: " + this.saldo);

        } else {
            System.out.println("Saldo insuficiente");}
    }

}
