package com.company;

public class CajaDeAhorro extends Cuenta {
    //Atributos
    private Double tasaDeInteres;



    public CajaDeAhorro(Integer nroCuenta, Cliente titular, Double tasaDeInteres) {
        super(nroCuenta, titular);
        this.tasaDeInteres = tasaDeInteres;
    }

    //Setters y getters

    public Double getTasaDeInteres() {
        return tasaDeInteres;
    }

    //Responsabilidad
    public void cobrarInteres(){
        setSaldo(getSaldo()*tasaDeInteres);
    }
}
