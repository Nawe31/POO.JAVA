/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relacionesv2;

import Entidades.Equipo;
import Entidades.jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Relacionesv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean confi = true;
        jugador p1 = new jugador();
        ArrayList<jugador> eq = new ArrayList();
        do {

            System.out.println(" ingrese su nombre");
            p1.setNombre(leer.next());
            System.out.println("ingrese su apellido");
            p1.setApellido(leer.next());
            System.out.println(" ingrese su posicion");
            p1.setPosicion(leer.next());
            System.out.println(" ingrese su numero");
            p1.setNumero(leer.nextInt());

            eq.add(p1);

            Equipo equipo = new Equipo();

            equipo.setJugadores(eq);

            System.out.println(" decea cargar otro jugador S/N");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("N")) {
                confi = false;
            }

        } while (confi);

        for (jugador object : eq) {
            System.out.println(object);
        }
    }

}
