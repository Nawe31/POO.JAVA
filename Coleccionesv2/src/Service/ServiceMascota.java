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

   Mascotas p1 = new Mascotas();
  private  Scanner leer = new Scanner(System.in);

    private List<String> Mascotas;

    public ServiceMascota() {
        this.Mascotas = new ArrayList();
    }

    public void crearMascotas() {

        System.out.println(" ingrese nombre");
        p1.setNombre(leer.next());
        System.out.println(" ingrese apodo");
        p1.setApodo(leer.next());
          System.out.println(" ingrese si tipo");
        p1.setTipo(leer.next());

        Mascotas.add(p1.getNombre() + " " + p1.getApodo()+" " + p1.getTipo());

    }

    public void mostrarMascotas() {
        for (String aux : Mascotas) {
            System.out.println(" "+ aux + " " );
        }
    }
}
