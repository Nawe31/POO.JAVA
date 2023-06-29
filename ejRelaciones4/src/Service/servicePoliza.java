/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Polizas;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class servicePoliza {

    public Polizas crearPolizas() {
        Scanner leer = new Scanner(System.in);
        serviceCliente sct = new serviceCliente();
        serviceCuotas sc = new serviceCuotas();
        serviceVehiculos sv = new serviceVehiculos();
        
        Polizas polizas = new Polizas();
        
        polizas.setVehiculos(sv.crearVehiculos());
        polizas.setClientes(sct.crearCliente());
        System.out.println(" ingrese numero de poliza");
        polizas.setNumeroPoliza(leer.nextInt());
       polizas.setCuotas(sc.crearCuotas());
       sc.informePago();
        System.out.println(" ingrese si cubre granizo S/N");
        String resp = leer.next();
        if(resp.equalsIgnoreCase("N")){
        polizas.setGranizo(false);
        }
        else{polizas.setGranizo(true);}
        System.out.println(" ingrese su tipo de cobertura");
        polizas.setTipoCobertura(leer.next());
        
        return polizas;

    }

}
