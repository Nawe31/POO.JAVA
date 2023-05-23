/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package extras2;

import Model.Circunferencia;
import Service.ServiceSircunferencia;
import java.util.Scanner;

public class Extras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ServiceSircunferencia sv = new ServiceSircunferencia();
        Circunferencia c1 = sv.crearCircunferencia();
        
        int respues;
        
        System.out.println(" ingrese opcion correcata ");
        System.out.println("-------------------------");
        System.out.println(" -1- para mostrar area ");
        System.out.println(" -2- para mostrar perimetro ");
        
        respues = read.nextInt();
        
        switch (respues) {
            
            case 1: {
                
                System.out.println("el area es" + sv.area(c1));
                
            }
            
            case 2: {
                
                System.out.println(" el perimetro es" + sv.perimetro(c1));
            }
            
        }
        
    }
    
}
