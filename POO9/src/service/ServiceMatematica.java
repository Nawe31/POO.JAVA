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
package service;

import entidad.Matematica;
import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 *
 * @author nahue
 */
public class ServiceMatematica {
    
    Matematica m1 = new Matematica();
     Matematica m2 = new Matematica();
    
    public Matematica creaObjeto(){
        
       double n1 = Math.random() * 99 + 1;
       double n2 = Math.random() * 99 + 1;
      
       m1.setNum(n1);
       m1.setNum2(n2);
       
      return m1;
    }
    
    public Matematica crearObjetoParametro(){
       double n1 = Math.random() * 99 - 300;
       double n2 = Math.random() * 99 - 300;
       
       return new Matematica(n1,n2);
        
    }
    
    public void devolverMayor(){
    
       System.out.println(" el numero mayor es : "+max(m1.getNum(),m1.getNum2()));
       
    }
    
    public void calcularPotencia(){
        double n1 = Math.ceil(max(m1.getNum(),m1.getNum2()));
        double n2 = Math.ceil(min(m1.getNum(),m1.getNum2()));
        double cp = Math.pow(n1, n2);
        System.out.println(" "+n1);
        System.out.println(" "+n2);
        System.out.println("calcular pot con metodo 1 : "+cp);
        
    /* System.out.println(" la potencia es : "  );
        
    System.out.println(Math.pow(max((int)m1.getNum(),(int)m1.getNum2()),min((int)m1.getNum(),(int)m1.getNum2())));*/
    
    
        
    }
    
    public void  calculaRaiz(){
      double n2 = Math.sqrt(Math.abs(min(m1.getNum(),m1.getNum2())));
      
      
        System.out.println(" la raiz cuadrada del minimo es "+ n2);
    
    }

   

   
    
}
