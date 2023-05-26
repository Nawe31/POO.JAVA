/* Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c



 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
 */
package Service;

import java.util.Scanner;
import model.Raices;

/**
 *
 * @author nahue
 */
public class ServiceRaices {

    Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {
        Raices r1 = new Raices();

        System.out.println(" ingrese el valor de a ");
        r1.setA(leer.nextDouble());
        System.out.println(" ingrese el valor de b ");
        r1.setB(leer.nextDouble());
        System.out.println(" ingrese el valor de c ");
        r1.setC(leer.nextDouble());

        return r1;
    }

    public double getDiscriminante(Raices r1) {
        
        
        

        double aux = ((r1.getB() * r1.getB()) - 4 * r1.getA() * r1.getC());

        System.out.println(" el Discriminante es : " + aux);
        //(b^2)-4*a*c

        return aux;
    }
    //  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.

    public boolean tieneRaices(double aux) {

        boolean auxb = false;

        if (aux == 0 || aux > 0) {

            auxb = true;

        }
        System.out.println(" tiene dos soluciones");
        return auxb;
    }

    public boolean tieneRaiz(double aux) {
        boolean tieneRaiz = false;

        if (aux == 0);
        {

            tieneRaiz = true;
        }

        return tieneRaiz;
    }

// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.
    public String obtenerRaices(boolean auxb, double aux) {
       
        String obtenerRaices = " ";
        if (auxb == true);
        {
          obtenerRaices = " las posibles soluciones son 0 y : " + aux;
        }
        
        
        return obtenerRaices;

    }

    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz( boolean tieneRaiz ) {

        if (tieneRaiz == true) {

            System.out.println(" la unica solucion es 0");
        }
    }
    
    // Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
  //pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
  //obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
  //de no existir solución, se mostrará un mensaje.

    
 
}
