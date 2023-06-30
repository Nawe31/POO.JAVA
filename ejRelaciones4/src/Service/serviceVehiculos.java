/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Vehiculos;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class serviceVehiculos {
    
    public Vehiculos crearVehiculos(){
        Scanner leer = new Scanner(System.in);
    Vehiculos veiculos = new Vehiculos();
        System.out.println(" ingrese su marca");
        veiculos.setMarca(leer.next());
        System.out.println(" ingrese su año");
        veiculos.setAnio(leer.nextInt());
        System.out.println("ingrese su numero de motor");
        veiculos.setNumeroMotor(leer.nextInt());
        System.out.println(" ingrese su chasis");
        veiculos.setChsis(leer.next());
        System.out.println(" ingrese su color");
        veiculos.setColor(leer.next());
        System.out.println(" ingrese su tipo");
        veiculos.setTipo(leer.next());
    
        
        
        return veiculos;
    
    }
}
