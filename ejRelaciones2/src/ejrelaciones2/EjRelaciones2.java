/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrelaciones2;

import Entidades.Juego;

/**
 *
 * @author nahue
 */
public class EjRelaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Juego juego = new Juego();
      juego.llenarJuego();
      juego.ronda();

    }
    
}
