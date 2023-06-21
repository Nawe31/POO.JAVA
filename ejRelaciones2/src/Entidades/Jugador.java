/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Jugador{
    
    private int id;
    private String nombre;
    boolean mojado;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getMojado() {
        return mojado;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
    
    public Jugador() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese su id del 1 al 6 no se puede repetir");
        this.id = leer.nextInt();
        
       if ( this.id > 6 || this.id < 1){
       this.id = 6;
       }
        System.out.println(" ingrese su nombre");
        this.nombre = leer.next();
               
    }
    

    
    
    
    public void disparo(Revolver r, Jugador jugador){
    
       r.siguienteChorro();
       jugador.setMojado(r.mojar());
       
    }
    
      
    
}
