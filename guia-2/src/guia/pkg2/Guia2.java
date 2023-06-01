/*

 */
package guia.pkg2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
        ArrayList<Integer> nombres1 = new ArrayList();

        nombres1.add(1);
        nombres1.add(2);
        nombres1.add(3);
        nombres1.add(4);
        nombres1.add(5);
        
       // nombres1.remove(2);
        //nombres1.remove(0);
        
        //remover con iterator
        Iterator <Integer> it = nombres1.iterator();
        while(it.hasNext()){
        if(it.next().equals(2))
            it.remove();
        }
        
        //recorrer lista con iterator 
        
        Iterator iterator = nombres1.iterator();
        
        System.out.println(" elementos de la lista");
        
        while(iterator.hasNext()){
        
            System.out.println(iterator.next() + " ");
        }
        
        System.out.println(" ");

    

        System.out.println("");
        System.out.println(" -------------------------");
        System.out.println("");

        Set MiSet = new HashSet();

        MiSet.add("nahuel");
        MiSet.add("mica");
        MiSet.add("julio");
        MiSet.add("lorena");
        MiSet.add("beltran");
        
        MiSet.remove("nahuel");

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

        MiMap.remove("valor3"," julio ");
                
        imprimir(MiMap.keySet());
        imprimir(MiMap.values());
     
        

    }

    public static void imprimir(Collection<String> coleccion) {

        for (Object elementos : coleccion) {

            System.out.println(elementos);
        }

    }
    
    

}
