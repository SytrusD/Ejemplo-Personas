/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidswcompany.ejemplopersonas;

/**
 *
 * @author David Caiza
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String email;

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    @Override
    public String toString() {
        return String.format("Name: %s; Email: %s; Edad: %d", nombre, (email != null) ? email : "email no proporcionado", (edad != -1) ? edad : "Edad no definida");
    }
}
