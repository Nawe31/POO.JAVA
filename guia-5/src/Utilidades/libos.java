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
public class libos {
    
    private String libro;

    public libos() {
    }

    public libos(String libro) {
        this.libro = libro;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "libos{" + "libro=" + libro + '}';
    }
    
    
    
    
    
    
}
