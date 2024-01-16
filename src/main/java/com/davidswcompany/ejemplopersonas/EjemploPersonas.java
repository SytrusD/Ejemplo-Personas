/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.davidswcompany.ejemplopersonas;

/**
 *
 * @author David Caiza
 */
public class EjemploPersonas {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 16, 1, "Software", null, null);
        Estudiante estudiante2 = new Estudiante("Martha", 19, 5, "Mecánica", "martha@espe.adu.ec", null);
        Estudiante estudiante3 = new Estudiante("Carlos", 17, 3, "Electrónica", null, null);
        Estudiante estudiante4 = new Estudiante("Patricia", 20, 8, "Petroquímica", "patty@espe.edu.ec", null);

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println(estudiante4.toString());
    }
}
