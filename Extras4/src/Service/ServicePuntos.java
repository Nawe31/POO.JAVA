/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente
 */
package Service;

import java.util.Scanner;
import model.Puntos;

/**
 *
 * @author nahue
 */
public class ServicePuntos {

    Scanner leer = new Scanner(System.in);
    Puntos p1 = new Puntos();

    public Puntos crearPuntos() {

        System.out.println(" ingrese el valor de x1");
        p1.setX1(leer.nextInt());
        System.out.println(" ingrese el valor de y1");
        p1.setY1(leer.nextInt());
        System.out.println(" ingrese el valor de x2");
        p1.setX2(leer.nextInt());
        System.out.println(" ingrese el valor de y2");
        p1.setY2(leer.nextInt());

        return p1;

    }
    
    
    
    public void resulado(Puntos p1){
    
        int x1 = p1.getX1();
        int y1 = p1.getY1();
        int x2 = p1.getX2();
        int y2 = p1.getY2();        
        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);     
    
    }

}
