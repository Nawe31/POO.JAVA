/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Persona;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class PersonaServicios {
    
 /* public Persona AltaPersonas(){
  
      Persona p1 = new Persona();
      Scanner read = new Scanner(System.in);
        
      System.out.println("ingrese su nombre");
      p1.setNombre(read.next());
      System.out.println(" ingrese su edad");
      p1.setEdad(read.nextInt());
      System.out.println(" ingrese su sexo, M para masculino, F para femenino y O para otros");
      p1.setSexo(read.nextLine());
      System.out.println(" Ingrese su altura");
      p1.setAltura(read.nextDouble());
      System.out.println(" ingrese su peso");
      p1.setAltura(read.nextDouble());


     return p1;      
  
 }*/
  
  /*
  
   Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
  
  */
  
  public double calcularIMC(double altura, double peso){
      
      double aux;
      int i = 0;
      aux = peso/(altura*altura);
      
      if (aux < 20){
        System.out.println(" su peso esta por debajo de su peso ideal");
        i = i -1;
       }
      else if (20<aux || aux<=25 ){
          
          System.out.println(" su peso es ideal");
          i = i+0;
          
      
      }else{
      
          System.out.println(" usted esta por encima de su peso ideal");
          i=i+1;
      }
      
      return i;
     }
  
  /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
  public boolean esMayorDeEdad(int edad){
  
      boolean mayor;
      
  if(edad >=18){
  
      mayor=true;
      
  }else{
  mayor=false;
  }
  
  return mayor;
  }
    
     
   
    
       
}
