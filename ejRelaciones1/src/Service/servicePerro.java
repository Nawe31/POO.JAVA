/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class servicePerro {

    
  
    public ArrayList<Perro> crearPerro() {

        boolean resp = true;
        ArrayList<Perro> perros = new ArrayList();
        Perro p1 = new Perro();
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println(" ingrese nombre del perro");
            p1.setNombre(leer.next());
            System.out.println(" ingrese raza de perro");
            p1.setRaza(leer.next());
            System.out.println(" ingrese edad del perro");
            p1.setEdad(leer.nextInt());
            System.out.println(" ingrese tamanio");
            p1.setTamanio(leer.next());

            perros.add(p1);

            System.out.println(" desea agregar otro perro");
            String resp2 = leer.next();

            if (resp2.equalsIgnoreCase("N")) {

                resp = false;
            }
         
             
        } while (resp);

          
        return perros;

    }
    


}
