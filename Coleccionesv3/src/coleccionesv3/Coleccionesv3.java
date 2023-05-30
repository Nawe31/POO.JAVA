/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesv3;

import Entidades.Mascotas;
import Service.ServiceMascota;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Coleccionesv3 {


    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        ServiceMascota sm = new ServiceMascota();

        sm.fabricaMascota(2);
        
        sm.mostrarMascotas();
        
        System.out.println(" ingrese el nombre a borrar");
        String borrar = leer.nextLine();
        
        sm.eliminarNombre(borrar);

        sm.mostrarMascotas();
        
       
    }

}
