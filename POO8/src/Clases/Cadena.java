/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.

 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Cadena {
  
    
   String frase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + '}';
    }
   


   
   public void mostrarVocales( String frase){
       
       int vocales = 0;
       for (int i = 0; i < frase.length() ; i++) {
         
          
        if (frase.charAt(i)=='a' || frase.charAt(i)=='e'|| frase.charAt(i)=='i'|| frase.charAt(i)=='o'|| frase.charAt(i)=='u' ){
              
              
              vocales++;
          }
           
         
       }
       System.out.println(" LA CANTIDAD DE VOCALES ES  " + vocales);
   
   }
   
   /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
   
   public void invertirFrase( String frase){
   
    
           
           
            for (int i = frase.length()-1; i > 0; i--) {
            
            
            System.out.println(frase.charAt(i));
        }
       
       
   }
    
    
  /*vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
   
   public void vecesRepetido(String frase){
       Scanner leer = new Scanner(System.in);
       String letra = "";
       System.out.println(" ingrese la letra que quiere buscar");
       letra = leer.next();
       int z = 0;
       for (int i = 0; i < frase.length(); i++) {
     
           
           if(frase.substring(i,i+1).equals(letra)){
           
               z++;
               
           }
         
       }
         System.out.println(" su letra esta "+ (z)+ " veces en la frace" );
       
   }
   
   
   /* metodo compararLongitud(string frace), debecomparar la longitud de la frace
   que compone la clase con otra frace nueva ingresada por el usuario
   */
   
   public void compararLongitud(String frase){
       
      Scanner leer = new Scanner(System.in);
      String fraseN; 
      
       System.out.println(" ingrese una nueva frace ");
       fraseN = leer.nextLine();
       
       if (frase.length() >= fraseN.length()){
       
           System.out.println(" la frace inicual es mayo o igual que la segunda frace ingresada ");
       }
       else{
           System.out.println(" la primer frace ingresada es menor que la segunda ");
       }
   
   }
   
    
/* Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/

public void unirFrases(String frase){

 Scanner leer = new Scanner(System.in);
 String fraseU, resultadoU; 
      
 System.out.println(" ingrese una nueva frace ");
 fraseU = leer.nextLine();
       
       resultadoU = (frase + fraseU);
       
       System.out.println(" la frase unida es "+resultadoU);
}

/* Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.*/

public void reemplazar(String frase){

  
        
        String remplazar,fraseR;
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese la letra que se reemplazara por la A");
        remplazar = leer.nextLine();
        

        
        fraseR = frase.replace("a",remplazar);
             
         System.out.println( fraseR);
}
    
   
/* Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. */

public void contiene(String frase){
    String contiene;
    boolean auxC;
       auxC = false;
    Scanner leer = new Scanner(System.in);
    System.out.println(" ingrese una letra para comprobar si esta en la frace");
    contiene = leer.nextLine();
    
    
    for (int i = 0; i < frase.length(); i++) {
        
        if (frase.substring(i,i+1).equals(contiene) ){
            auxC = true;
            }
       
        
        }
    System.out.println(" "+auxC+" " );
}


}




