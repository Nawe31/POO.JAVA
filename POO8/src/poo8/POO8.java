/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
 */
package poo8;

import Clases.Cadena;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class POO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Scanner leer = new Scanner(System.in);
       Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frace o varias palabras separadas");
        c1.setFrace(leer.next());*/
        
          
        Scanner leer = new Scanner(System.in);
        
        
        String frace;
        System.out.println("Ingrese una frace o varias palabras separadas");
        frace = leer.next();
    
        for (int i = frace.length()-1; i > 0; i--) {
            
            
            System.out.println(frace.charAt(i));
        }
    }
    
}
