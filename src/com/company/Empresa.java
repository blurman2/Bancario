package com.company;

public class Empresa extends Cliente {
    //Atributos
    private String nomFantasia;
    private Integer cuit;

    //Constructor
    public Empresa(Integer nroCliente, String nomFantasia, Integer cuit) {
        super(nroCliente);
        this.nomFantasia = nomFantasia;
        this.cuit = cuit;
    }

    //Getters y Setters
    public String getNomFantasia() {
        return nomFantasia;
    }

    public Integer getCuit() {
        return cuit;
    }
}
