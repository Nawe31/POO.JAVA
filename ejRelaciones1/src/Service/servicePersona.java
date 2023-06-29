/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import Service.servicePerro;
/**
 *
 * @author nahue
 */
public class servicePersona {
    
     ArrayList<Persona> personas = new ArrayList();


     
     
     
        public ArrayList<Persona> crearPersona() {

        boolean resp = true;
       
        Persona p2 = new Persona();
        Scanner leer = new Scanner(System.in);
       

        do {
            System.out.println(" ingrese nombre del persona");
            p2.setNombre(leer.next());
            System.out.println(" ingres apellido");
            p2.setApellido(leer.next());
            System.out.println(" ingrese edad ");
            p2.setEdad(leer.nextInt());
            System.out.println(" ingrese documento");
            p2.setDocumento(leer.nextInt());
            System.out.println(" ingrese raza de perro");
             p2.setRaza(leer.next());

           personas.add(p2);

            System.out.println(" desea agregar otra persona?");
            String resp2 = leer.next();

            if (resp2.equalsIgnoreCase("N")) {

                resp = false;
            }
         
             
        } while (resp);

          
        return personas;

    }
        
        
        
       public void calcular(Persona p1, Perro p2){
        
           for (Persona persona : personas) {
               
               if(p1.getRaza() == p2.getRaza()){
               
                personas.remove(p2.getRaza());
                
                System.out.println(p1.getNombre().toString()+" su perro de raza"+ p2.getRaza().toString()+" fue otorgado");
               
               }
               else{
               
                   System.out.println(" el perro que quiere fue adoptado");
               }
           }
            

        }
    
}
