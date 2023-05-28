/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesv2;

import Entidades.Mascotas;
import Service.ServiceMascota;

/**
 *
 * @author nahue
 */
public class Coleccionesv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceMascota sm = new ServiceMascota();

        sm.crearMascotas();
        sm.crearMascotas();
        sm.mostrarMascotas();

    }

}
