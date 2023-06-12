/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones5;

import Service.ServicePais;



public class EjColecciones5 {



    public static void main(String... args) {
       ServicePais sp = new ServicePais();
       
       sp.crearPaises();
       sp.borrarPaises();

    }
    
}
