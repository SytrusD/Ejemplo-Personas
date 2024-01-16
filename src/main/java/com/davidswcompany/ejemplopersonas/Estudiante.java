/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidswcompany.ejemplopersonas;

/**
 *
 * @author David Caiza
 */
public class Estudiante extends Persona {
    private int nivel;
    private String carrera;
    private String curso;

    public Estudiante(String nombre, int edad, int nivel, String carrera, String email, String curso) {
        super(nombre, edad, email);
        this.nivel = nivel;
        this.carrera = carrera;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Estudiante (%s; Nivel: %d; Carrera: '%s'; Curso: '%s')", super.toString(), nivel, carrera, curso);
    }
}

