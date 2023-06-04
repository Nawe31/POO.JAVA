
package guia.pkg5;

import Utilidades.Perro;
import Utilidades.libos;
import java.util.ArrayList;
import java.util.HashSet;


public class Guia5 {

    /**
EJERCICIO LISTA LIBROS
¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
     */
    public static void main(String[] args) {
        
  
        
       ArrayList<libos> Libo = new ArrayList();
       
       libos libo = new libos("nahuel");
       
     
       
       
       Libo.add(libo);
       
       
       for (libos object : Libo) {
        
           System.out.println(object);
            
        }
       
        HashSet<Perro> perros = new HashSet();
        
        Perro perro = new Perro(2);
       
       perros.add(perro);
       
        for (Perro perro1 : perros) {
            
            System.out.println(perro1);
        }
    }
    
}
