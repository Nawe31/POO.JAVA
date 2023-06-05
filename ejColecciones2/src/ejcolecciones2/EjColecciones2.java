/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ejcolecciones2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class EjColecciones2 {

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

                respuesta = false;
            }
            System.out.println("--------");
        } while (respuesta);

        System.out.println(Mascotas.size());
        for (String Mascota : Mascotas) {
            System.out.println(Mascota);
        }
        System.out.println(" ingrese el nombre de un perro borrar");
        String borrar = leer.next();

        Iterator it = Mascotas.iterator();

        while (it.hasNext()) {
            if (it.next().equals(borrar)) {
                it.remove();
            }

        }
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");
        for (String Mascota : Mascotas) {

            System.out.println(Mascota);
        }

    }

}
