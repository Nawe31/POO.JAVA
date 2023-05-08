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

/**
 *
 * @author nahue
 */
public class Cadena {
  
    
   String frace;
   int logitud = frace.length();

    public Cadena() {
    }

    public Cadena(String frace) {
        this.frace = frace;
    }

    public String getFrace() {
        return frace;
    }

    public void setFrace(String frace) {
        this.frace = frace;
    }

    public int getLogitud() {
        return logitud;
    }

    public void setLogitud(int logitud) {
        this.logitud = logitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frace=" + frace + ", logitud=" + logitud + '}';
    }
   
   public void mostrarVocales(int longitud, String frace){
       for (int i = 0; i < frace.length() ; i++) {
          int vocales = 0;
          
          if ( frace.charAt(i)=='a'|| frace.charAt(i)=='e'|| frace.charAt(i)=='i'|| frace.charAt(i)=='o'|| frace.charAt(i)=='u' ){
              
              
              vocales++;
          }
           
           System.out.println(" LA CANTIDAD DE VOCALES ES "+ vocales);
       }
   
   }
   
   /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
   
   public void invertirFrase(int longitud, String frace){
   
    
           
           
            for (int i = frace.length()-1; i > 0; i--) {
            
            
            System.out.println(frace.charAt(i));
        }
       
       
   }
    
    
    
}
