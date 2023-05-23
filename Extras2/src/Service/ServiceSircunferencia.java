/*

c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Service;

import Model.Circunferencia;
import java.util.Scanner;

public class ServiceSircunferencia {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        Circunferencia c1 = new Circunferencia();

        System.out.println(" ingrese el radio");
        c1.setRadio(leer.nextDouble());

        return c1;
    }

    public double area(Circunferencia c1) {

        double area = (3.14 * (c1.getRadio() * c1.getRadio()));

        return area;

    }

    public double perimetro(Circunferencia c1) {

        double perimetro = ( 2 * 3.14 * c1.getRadio() );
        
        return perimetro;
        
    }

}
