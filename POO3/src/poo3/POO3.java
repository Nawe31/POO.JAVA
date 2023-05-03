/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package poo3;

import PooObjeto.Operacion;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class POO3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       Operacion op = new Operacion();
      
        System.out.println(" elija la operacion que desee  ");
        System.out.println("  1 --- PARA SUMAR----");
        System.out.println("  2 --- PARA RESTAR----");
        System.out.println("  3 --- PARA MULTIPLICAR----");
        System.out.println("  4 --- PARA DIVIDIR --- ");
        
        int num = leer.nextInt();
        
      
        switch(num){
        
            case 1:{
            op.crearOperacion();
            op.sumar(op.getNum1(),op.getNum2());
            break;
            }
            case 2:{
                op.crearOperacion();
                op.restar(op.getNum1(),op.getNum2());
                break;
            }
            case 3:{
             op.crearOperacion();
             op.multiplicacion(op.getNum1(),op.getNum2());
             break;
            }
            case 4:{
             op.crearOperacion();
             op.dividir(op.getNum1(),op.getNum2());
            }
            
        }
                
                
        
    }
    
}
