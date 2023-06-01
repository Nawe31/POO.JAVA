/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * EJERCICIO COLECCIONES Toma la Lista, el Conjunto y el Mapa del ejemplo y
 * agrega 5 objetos a cada uno.
 */
public class Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres1 = new ArrayList();

        nombres1.add("nahuel");
        nombres1.add("mica");
        nombres1.add("julio");
        nombres1.add("lorena");
        nombres1.add("beltran");

        nombres1.forEach((aux) -> {
            System.out.println(aux);
        });

        System.out.println("");
        System.out.println(" -------------------------");
        System.out.println("");

        Set MiSet = new HashSet();

        MiSet.add("nahuel");
        MiSet.add("mica");
        MiSet.add("julio");
        MiSet.add("lorena");
        MiSet.add("beltran");

        MiSet.forEach((aux2) -> {
            System.out.println(aux2);

        });

        System.out.println("");
        System.out.println(" -------------------------");
        System.out.println("");

        Map MiMap = new HashMap();
        MiMap.put("valor1", "nahuel");
        MiMap.put("valor2", "mica");
        MiMap.put("valor3", " julio ");
        MiMap.put("valor4", "lorena");
        MiMap.put("valor5", "beltran");

        imprimir(MiMap.keySet());
        imprimir(MiMap.values());
     

    }

    public static void imprimir(Collection<String> coleccion) {

        for (Object elementos : coleccion) {

            System.out.println(elementos);
        }

    }

}
