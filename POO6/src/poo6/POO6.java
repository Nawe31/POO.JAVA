/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package poo6;

import ObjetosPoo.Cafeteria;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class POO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafeteria op = new Cafeteria();
        
        
          System.out.println(" elija la operacion que desee  ");
        System.out.println("  1 --- PARA SERVIR SU CAFE----");
        System.out.println("  2 --- PARA VACIAR CAFETERA----");
        System.out.println("  3 --- AGREGAR CAFE---");
    
        
        
         int num = leer.nextInt();
        
        switch(num){
            case 1:{
            op.servirTaza(op.getCapacidadActual(),op.getCapacidadMaxima() );
            break;}
            
            case 2:{
             op.vaciarCafetera(op.getCapacidadActual());
           }
            case 3:{
            op.agregarCafe(op.getCapacidadActual());
            }
            
        
        
        }
        
        
    }
    
}
