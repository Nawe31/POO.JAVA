/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Clientes;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class serviceCliente {
    
    public Clientes crearCliente(){
        Scanner leer = new Scanner( System.in);
        Clientes clientes = new Clientes();
        
        System.out.println(" ingrese su nombre");
        clientes.setNombre(leer.next());
        System.out.println(" ingrese su apellido");
        clientes.setApellido(leer.next());
        System.out.println("ingrese su documento");
        clientes.setDocumento(leer.nextInt());
        System.out.println(" ingrese su domicilio");
        clientes.setDomicilio(leer.next());
        System.out.println(" ingrese su mail");
        clientes.setMail(leer.next());
        System.out.println(" ingrese su telefono");
        clientes.setTelefono(leer.nextInt());
        
        return clientes;
        
    }
    
}
