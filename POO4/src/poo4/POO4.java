/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package poo4;

import Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class POO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
     Scanner leer = new Scanner(System.in);
       Rectangulo op  = new Rectangulo();
      
        System.out.println(" elija la operacion que desee  ");
        System.out.println("  1 --- PARA MOSTRAR SUPERFICIE----");
        System.out.println("  2 --- PARA MOSTRAR EL PERIMETRO----");
        System.out.println("  3 --- PARA DIBUJAR----");
      
        
        int num = leer.nextInt();
        
      
        switch(num){
        
            case 1:{op.datos();
            op.superficie();
        
            break;
            }
            case 2:{
                op.datos();
                op.superficie();
                                break;
            }
            case 3:{
                op.datos();
                op.Dibujar();
            
             break;
            }
          
            
        }
            
        }
        
        
        
    }
    

