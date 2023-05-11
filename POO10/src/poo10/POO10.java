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
package poo10;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author nahue
 */
public class POO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        Random random = new Random();
     

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextDouble();
            //System.out.print("[" + arrayA[i] + "]");            
        }

        // Mostrar arregloA sin ordenar
        System.out.println("Arreglo A sin ordenar:");
        System.out.print(Arrays.toString(arrayA));
        System.out.println("");
        
        // mostrar el arreglo ordenado 
        System.out.println(" ARRAY A ORDENADO ");
        Arrays.sort(arrayA);
        System.out.print(Arrays.toString(arrayA));
        System.out.println("");
        
        //copiando los primeros 10 nuemors del array a y rellenarlos en el b
        
        for (int i = 0; i < 10; i++) {
            
            arrayB[i]=arrayA[i];
            
        }
        System.out.println(" primeros 10 numeros del array A ");
         System.out.print(Arrays.toString(arrayB));
        System.out.println("");
        
        System.out.println(" los ultimos 10 numeros iguales a 0.5");
       Arrays.fill(arrayB, 10,arrayB.length,0.5);
         System.out.print(Arrays.toString(arrayB));
    }
    
}
