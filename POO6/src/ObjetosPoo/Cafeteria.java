/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ObjetosPoo;

import java.util.Scanner;

/**
 */
public class Cafeteria {
    
    private double CapacidadMaxima = 50;
    private double CapacidadActual = 40;

    public Cafeteria(double CapacidadMaxima, double CapacidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CapacidadActual = CapacidadActual;
    }

    public Cafeteria() {
    }

    public double getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(double CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public double getCapacidadActual() {
        return CapacidadActual;
    }

    public void setCapacidadActual(double CapacidadActual) {
        this.CapacidadActual = CapacidadActual;
    }
    
    public void llenarCafetera(double CapacidadMaxima, double CapacidadActual ){
    double aux = 0;
    
    CapacidadActual= aux;
    aux= CapacidadMaxima;
    CapacidadActual=aux;
    
        System.out.println(" la capacidad maxia es "+aux );
    
    }
    
    public void servirTaza(double CapacidadMaxima,double CapacidadActual){
        
        String taza;
        Scanner leer = new Scanner (System.in);
        
        System.out.println(" ingrese el tamaño de la taza si es: mediana, chica o grande");
        taza = leer.next();
        
        if (null != taza)switch (taza) {
            case "chico":
                CapacidadActual = CapacidadActual-20;
                break;
            case "mediano":
                CapacidadActual = CapacidadActual-40;
                break;
            case "grande":
                CapacidadActual = CapacidadActual-60;
                break;
            default:
                break;
        }
        
        
        
        
       if( CapacidadActual >= 0){
    
        System.out.println(" su cafe " + taza + "sera servido en la brevedad, muchas gracias");
        }
       else{
           System.out.println(" no contamos con suficiente cafe por favor cambie el producto");
         
       }
        
        
    }
    
    
    public void vaciarCafetera(double CapacidadActual){
        double aux = (CapacidadActual - CapacidadActual);
        
        System.out.println(" la maquina fue vaciada esta en :" + aux);
    
    
    }
    
    public void agregarCafe(double CapacidadActual){
       double AgCafe;
      Scanner read = new Scanner (System.in);
      
        System.out.println(" ingrese la cantidad de cafe que decea ");
        AgCafe = read.nextDouble();
      
        
        if ( CapacidadActual >= AgCafe){
        
            System.out.println(" su pedido fue prosesado correctamente");
        }
        else{
            System.out.println(" cafe insuficiente, por favor ingrese un monto igual o menor a "+CapacidadActual);
        }
      
        
        
    }
    
    
}
