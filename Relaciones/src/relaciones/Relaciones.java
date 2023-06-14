/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Relaciones {

    /**
     * EJERCICIO PERSONA Realiza un programa en donde una clase Persona tenga
     * como atributo nombre, apellido y un objeto de clase Dni. La clase Dni
     * tendrá como atributos la serie (carácter) y número. Prueba acceder luego
     * a los atributos del dni de la persona creando objetos y jugando desde el
     * main.
     */
    public static void main(String[] args) {
        Dni dni = new Dni();
        Scanner leer = new Scanner(System.in);

        System.out.println(" INGRESE SU DNI");
        dni.setDni(leer.nextInt());

        Persona p1 = new Persona();
        p1.setNombre("nahuel");
        p1.setApellido("francia");
        p1.setDni(dni);
        
        System.out.println(p1);
    }

}
