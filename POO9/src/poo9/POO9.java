/*
Método Static y Clase Math

9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package poo9;

import entidad.Matematica;
import service.ServiceMatematica;

/**
 *
 * @author nahue
 */
public class POO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        ServiceMatematica sm = new ServiceMatematica();
        
        Matematica mat1 = sm.creaObjeto();
        System.out.println(mat1.toString());
        System.out.println(mat1.getNum() +"  "+ mat1.getNum2() );
        
        
       /* Matematica mat2 = sm.crearObjetoParametro();
        System.out.println(mat2.toString());*/
        
        sm.devolverMayor();
        sm.calcularPotencia();
        sm.calculaRaiz();
        
        
        
        
        
    }
    
}
