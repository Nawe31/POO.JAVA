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

        System.out.println("decea agregar una raza de perro ? ");
        String respuesta = leer.next();
        ArrayList<String> Mascotas = new ArrayList();

        do {
            System.out.println(" ingrese raza de perro, en casa de no querer ingresar escriba salir");
            String raza = leer.next();
            Mascotas.add(raza);

            if (raza.equals("salir")) {

                System.out.println(" la ccantitad y raza de mascotas son");
                break;
            }
            System.out.println("--------");
        } while (respuesta.equals("si"));
        System.out.println(Mascotas.size());
        System.out.println(Mascotas);

    }

}
