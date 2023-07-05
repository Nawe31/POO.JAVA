/*

 */
package herencia01;

import Entidades.Animales;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author nahue
 */
public class Herencia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animales Perro1 = new Perro("stich", "carnivoro","boderman",15);
        Perro1.alimentarse();
        
        Animales Perro2 = new Perro("teddy","croquetas","chihuahua",10);
        Perro2.alimentarse();
        
        Animales Gato1 = new Gato("pelusa", "galletas", "siames",15);
        Gato1.alimentarse();
        
        Animales Caballo1 = new Caballo("Spark","pasto","fino",15);
        Caballo1.alimentarse();
        
    }
    
}
