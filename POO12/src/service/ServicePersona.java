/*

 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package service;

import java.util.Date;
import java.util.Scanner;
import model.DataPersona;

/**
 *
 * @author nahue
 */
public class ServicePersona {
    
    
    public DataPersona crearPersona()  {
      Scanner leer = new Scanner (System.in);
      DataPersona dp = new DataPersona(); 
      
      String nombreP;
        System.out.println("ingrese su nombre");
        nombreP =leer.next();
       int dia,mes,anio;
      
   do {
            System.out.println("Registre el día: ");
            dia = leer.nextInt();
        } while (dia < 0 && dia >= 31);
        do {
            System.out.println("Registre el mes: ");
            mes = leer.nextInt();
        } while (mes < 0 && mes >= 12);
        do {
            System.out.println("Registre el año: ");
            anio = leer.nextInt();
        } while (anio < 0 && anio >= 3000);

        Date aux = new Date(anio - 1900, mes - 1, dia);
         
         dp.setFecha(aux);
         dp.setNombre(nombreP);
         
         return dp;
        
    }
    
    public void MayorDeEdad(DataPersona dp){
    Date fechaHoy = new Date();
    boolean aux;
    int antiguedad = fechaHoy.getDay() - dp.getFecha().getYear();
    
    if( antiguedad >= 18){
    
        aux = true;
    }
    else{
     aux = false;
    }
    
    
        System.out.println(aux);
    }
    
}