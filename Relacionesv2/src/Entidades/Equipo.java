/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author nahue
 */
public class Equipo {
    
    private List<jugador> jugadores;

    public Equipo(List<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Equipo() {
    }

    public List<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
}
