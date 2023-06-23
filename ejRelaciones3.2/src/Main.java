import Servicios.barajaServicio;
import  Entidades.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
 barajaServicio bs = new barajaServicio();
 Baraja baraja = bs.CrearBaraja();
 boolean resp = true;
 do {
     System.out.println("ingrese el el numero correcto");

     System.out.println( " 1 - para barajar");
     System.out.println( " 2 - para ver  cartas disponibles");
     System.out.println( " 3 - para dar cartas ");
     System.out.println( " 4  - para mostrar cartas ");
     int num = leer.nextInt();

     switch (num) {
         case 1: bs.barajar(baraja); break;
         case 2: bs.cartasDisponibles(baraja); break;
         case 3: bs.darCartas(baraja); break;
         case 4: bs.mostrarBaraja(baraja); break;
         default:
             System.out.println(" DECEA SALIR S/N");
             String respuesta = leer.next();

             if( respuesta.equalsIgnoreCase("N")){

                 resp = false;
             }



     }
 } while(resp);



    }
}