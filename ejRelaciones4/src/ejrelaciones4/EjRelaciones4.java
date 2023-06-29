/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrelaciones4;

import Service.servicePoliza;

/**
 *
 * @author nahue
 */
public class EjRelaciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      servicePoliza sp = new servicePoliza();
      
        System.out.println(sp.crearPolizas());
      
      
    }
    
}
