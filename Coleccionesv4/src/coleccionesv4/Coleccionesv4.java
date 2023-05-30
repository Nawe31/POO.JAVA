/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesv4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nahue
 */
public class Coleccionesv4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> nombre = new ArrayList();

        nombre.add("lola");
        nombre.add("pepe");
        nombre.add("jose");

        //recorriendo arrays
        for (int i = 0; i < nombre.size(); i++) {

            System.out.println(nombre.get(i));

        }

        // de esta manera se rompe, no es recomendable
        /*
     
        for (String aux : nombre) {

            if (aux.equals("lola")) {
                nombre.remove(aux);
            }
            
            System.out.println( aux);
        }
         */
        // nombre.forEach((e)->System.out.println(e));
    }

}
