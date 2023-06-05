/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejcolecciones1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class EjColecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

       
        boolean respuesta = true;
        ArrayList<String> Mascotas = new ArrayList();

        do {
            System.out.println(" ingrese raza de perro");
            String raza = leer.next();
            Mascotas.add(raza);
            
            System.out.println(" decea salir S/N?");
            
            if (leer.next().equalsIgnoreCase("S")) {
                
              respuesta=false;
            }
            System.out.println("--------");
        } while (respuesta);
        
        System.out.println(Mascotas.size());
        for (String Mascota : Mascotas) {
            System.out.println(Mascota);
        }

    }

}
