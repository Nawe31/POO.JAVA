/*

 */
package javaapplication72;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication72 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Array normal
        String[] nombre = new String[5];

        for (int i = 0; i < nombre.length; i++) {

            nombre[i] = "nahuel" + (i + 1);

        }

        for (String aux : nombre) {

            System.out.println(aux);

        }

        //Collections
        ArrayList<String> nombre1 = new ArrayList();
        String aux = " ";
        nombre1.add(" pepe ");

        System.out.println(" ingrese el segundo nombre");
        aux = leer.nextLine();
        nombre1.add(aux);
        
        System.out.println(nombre1);
        System.out.println(nombre1.size());

    }

}
