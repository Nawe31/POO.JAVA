/*
Clase Arrays
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author nahue
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double arrayA [] = new double[50];
        double arrayB [] = new double[20];
        
        Random aleatorio = new Random();
      
       
        for (int i = 0; i < arrayA.length; i++) {
            
            arrayA[i]= aleatorio.nextDouble()*63;
            
        }
        
        System.out.println(" EL ARREGLO A ES");
         System.out.println(Arrays.toString(arrayA));
         
         
         
        
    }


   

  
    
}
