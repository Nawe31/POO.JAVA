/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Mascotas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ServiceMascota {

    private Scanner leer = new Scanner(System.in);

    private List<Mascotas> Mascotas;

    public ServiceMascota() {
        this.Mascotas = new ArrayList();
    }

    public Mascotas crearMascotas() {

        System.out.println(" ingrese nombre");
        String nombre = leer.next();
        System.out.println(" ingrese apodo");
        String apodo = leer.next();
        System.out.println(" ingrese si tipo");
        String tipo = leer.next();

        return new Mascotas(nombre, apodo, tipo);

    }

    public void agregarMascotas(Mascotas m) {
        Mascotas.add(m);
    }

    public void mostrarMascotas() {

        System.out.println(" la cantidad de mascotas creadas son");
        for (Mascotas aux : Mascotas) {
            System.out.println(aux.toString());
        }

        System.out.println("cantidad : " + Mascotas.size());
    }

    public void fabricaChiquito(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            Mascotas.add(new Mascotas("fer", "chiquito", "romero"));

        }
    }

    public void fabricaMascota(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            Mascotas mascotaCreadas = crearMascotas();

            agregarMascotas(mascotaCreadas);

            System.out.println(mascotaCreadas.toString());
        }

    }

    // actualizar objetos //
    /* public void actualizarMascota (int index){
        
        Mascotas m = Mascotas.get(index);
        m.setApodo("pato");
       
    }*/
    public void actualizarMascota2(int index) {

        if (index <= Mascotas.size() - 1) {
            Mascotas m = crearMascotas();
            Mascotas.set(index, m);

        } else {
            System.out.println(" fallo al actualizar");

        }

    }

    // eliminar objetos //
    public void eliminarMascota(int index) {
        if (index >= Mascotas.size() - 1) {
            Mascotas.remove(index);
        } else {

            System.out.println(" fallo al eliminar");
        }
    }

    public void eliminarNombre(String nombre) {

        for (int i = 0; i < Mascotas.size(); i++) {

            Mascotas m = Mascotas.get(i);

            if (m.getNombre().equals(nombre)) {

                Mascotas.remove(m);
            }

        }

    }
    
    
    
    public void actualizarNombre(String nombre, String nuevo) {

        for (int i = 0; i < Mascotas.size(); i++) {

            Mascotas m = Mascotas.get(i);

            if (m.getNombre().equals(nombre)) {

               m.setNombre(nuevo);
            }

        }

    }

}
