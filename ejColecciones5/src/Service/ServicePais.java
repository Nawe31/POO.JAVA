/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
 */
package Service;

import Entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class ServicePais {

    HashSet<String> Paises = new HashSet();

    public void crearPaises() {

        Scanner leer = new Scanner(System.in);
        boolean confirmacion = true;

        do {
            System.out.println(" ingrese el nombre del pais");
            String paises = leer.next();
            Paises.add(paises);
            

            System.out.println(" desea ingresar un pais nuevo S/N");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("N")) {
                confirmacion = false;
            }

        } while (confirmacion);

        for (String Paise : Paises) {
            
            System.out.println(Paise.toString());
        }
    }

    // Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    //cómo se ordena un conjunto.
    // ------ por defecto sale ordenado alfabeticamente-----


    /*Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
    public void borrarPaises() {

        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese el nombre de pais a borrar");
        String borrarP = leer.next();
       
        Iterator it = Paises.iterator();
        
        while (it.hasNext()) {
           
            
            if(it.next().equals(borrarP)){
            
               it.remove();
            }
        }
        
        for (String Paise : Paises) {
            
            System.out.println(Paise);
        }

    }

}
