/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nahue
 */
public class Guia3 {


    
    public static void main2(String[] args) {
        
        
        HashMap<Integer,String> personas = new HashMap();
        personas.put(1,"albus");
        personas.put (2,"albus"); 
    ;
        
    }
    
    
    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap();

        alumnos.put(28, "nahuel");
        alumnos.put(26, "micaela");
        
        for(Map.Entry<Integer, String> Entry: alumnos.entrySet()){
        
            System.out.println(" numero"+ Entry.getKey());
              System.out.println(" nombre "+ Entry.getValue());
            
        }
        
        
        System.out.println("  --------------------------------");
       
        for( Integer num : alumnos.keySet()){
            
            System.out.println(" numero "+ num);
        }
        
        for ( String nombre : alumnos.values()){
            System.out.println(" alumnos : "+ nombre);
            
        }
        
        
        System.out.println("-------------------------------");
        
        
        
       
        
    }

}
