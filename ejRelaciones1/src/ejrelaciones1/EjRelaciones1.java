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

/**
 *
 * @author nahue
 */
public class EjRelaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona[] personas = new Persona[2];
        personas[0] = new Persona("nahuel", "francia", 28, 123, null);
        personas[1] = new Persona("pepe", "francia", 28, 123, null);
        
        Perro[] perros = new Perro[2];
        
        perros[0] = new Perro("A", "b", 1, "chico");
        perros[1] = new Perro("b", "c", 2, "grande");
        
        for (int i = 0; i < personas.length; i++) {
            
            personas[i].setPerro(perros[i]);
            
        }
        
      
        for (Persona persona : personas) {
            
            System.out.println(persona.toString());
        }
    }
    
}
