/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ejrelaciones1;

import Entidades.Perro;
import Entidades.Persona;
import Service.servicePerro;
import Service.servicePersona;

/**
 *
 * @author nahue
 */
public class EjRelaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicePerro  sp = new servicePerro();
        servicePersona ps = new servicePersona();
        Perro p1 = new Perro();
        Persona p2 = new Persona();
        
        
        sp.crearPerro();
        ps.crearPersona();
        ps.calcular(p2, p1);
     
        
    }
    
}
