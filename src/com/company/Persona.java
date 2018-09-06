package com.company;

public class Persona extends Cliente{
    //Atributos
    private String nombre;
    private String apellido;
    private Integer dni;

    //Constructor
    public Persona(Integer nroCliente, String nombre, String apellido, Integer dni){
        super(nroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }
}
