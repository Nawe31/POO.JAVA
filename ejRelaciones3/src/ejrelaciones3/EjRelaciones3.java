/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrelaciones3;

import Entidades.Baraja;
import Entidades.Carta;

import java.util.ArrayList;

/**
 *
 * @author nahue
 */
public class EjRelaciones3 {

 


       public static void main(String[] args) {
       Baraja baraja = new Baraja();
        baraja.barajar();

        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());

        System.out.println("Mostrando las 5 siguientes cartas:");
        for (int i = 0; i < 5; i++) {
            Carta carta = baraja.siguienteCarta();
            System.out.println(carta);
        }

        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());

        System.out.println("Dando 3 cartas:");
        ArrayList<Carta> mano = baraja.darCartas(3);
        for (Carta carta : mano) {
            System.out.println(carta);
        }

        System.out.println("Mostrando el montón de cartas:");
        baraja.cartasMonton();

        System.out.println("Mostrando todas las cartas restantes en la baraja:");
       }}