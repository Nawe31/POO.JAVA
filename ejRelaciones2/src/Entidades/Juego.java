/*
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();

        Scanner leer = new Scanner(System.in);
        int cantidad;

        do {

            System.out.println(" cuantos jugadores decean participar?");
            cantidad = leer.nextInt();
            for (int i = 0; i < cantidad; i++) {
                Jugador jugador = new Jugador();
                jugadores.add(jugador);
            }
        } while (cantidad > 6 || cantidad < 2);
        
         this.jugadores = jugadores;
            this.revolver = new Revolver();
            revolver.llenarRevolver(revolver);

    }

    public void ronda() {
        
        for (Jugador jugadore : jugadores) {
            jugadore.disparo(revolver, jugadore);

            if (jugadore.isMojado()) {

                System.out.println(" el jugador" + jugadore + " se mojo");
                break;
            }
            
           // System.out.println(" el jugador" + jugadore.toString() + " se mojo");
            //break;
        }

    }

}
