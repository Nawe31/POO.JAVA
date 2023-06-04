/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author nahue
 */
public class Perro {
    
    private int perro;

    public Perro(int perro) {
        this.perro = perro;
    }

    public Perro() {
    }

    public int getPerro() {
        return perro;
    }

    public void setPerro(int perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Perro{" + "perro=" + perro + '}';
    }
    
    
    
}
