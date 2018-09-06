package com.company;

public class CuentaCorriente extends Cuenta {
    //Atributos
    private Double descubierto;


    //Constructor
    public CuentaCorriente(Integer nroCuenta, Cliente titular, Double descubierto) {
        super(nroCuenta, titular);
        this.descubierto = descubierto;
    }

    //Responsabilidades
}
