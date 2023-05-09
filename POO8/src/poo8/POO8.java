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
         Scanner read = new Scanner(System.in);
       
        
        Cadena op = new Cadena();
        
        System.out.println(" ingrese una frase");
        op.setFrase(read.next());
        
           System.out.println(" elija la operacion que desee  ");
        System.out.println("  1 --- PARA MOSTRAR VOCALES----");
        System.out.println("  2 --- PARA INVERTIR FRASE----");
        System.out.println("  3 ---  COMPARAR LONGITUD---");
        System.out.println("  4 --- UNIR FRASE---");
        System.out.println("  5 --- REEMPLAZAR LETRA---");
         System.out.println(" 6 --- COMPROBAR SI CONTIENE UNA LETRA---");
    
        
        
         int num = read.nextInt();
         
         
         switch(num){
             case 1:{
              op.mostrarVocales(op.getFrase());
                 
             }
             case 2:{
             op.invertirFrase(op.getFrase());
             break;
             }
             case 3:{
             op.compararLongitud(op.getFrase());
             break;
             }
              case 4:{
             op.unirFrases(op.getFrase());
             break;
             }
             case 5:{
             op.reemplazar(op.getFrase());
             break;
             }
             case 6:{
             op.contiene(op.getFrase());
             break;
             }
         
         
         
 }
    
}}
