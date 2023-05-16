/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import model.DateReg;
import service.ServiceDate;


public class EJERCICIO11 {

   
    public static void main(String[] args) {
        
        ServiceDate sd = new ServiceDate();
        DateReg d1 = sd.crearFecha();
       
        System.out.println(d1.toString());
        sd.compararAnio(d1);
        
        
        //segundo metodo con constructo con parametro//
        
        DateReg d2 = sd.crearFecha2();
        System.out.println(d2.toString());
        sd.compararAnio(d2);
    }
    
}
