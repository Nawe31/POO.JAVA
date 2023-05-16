/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Fechas;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class serviceFecha {
    
   Scanner leer = new Scanner(System.in);
   
   public Fechas crearFecha(){
       
       Fechas d1 = new Fechas();
       int dia,mes,anio;
       
       do{ System.out.println(" ingrese su dia");
          dia = leer.nextInt();
       } while (dia > 0 && dia >= 31);
        do{ System.out.println(" ingrese su mes");
          mes = leer.nextInt();
       } while (mes > 0 && mes >= 12);
         do{ System.out.println(" ingrese su añio");
          anio = leer.nextInt();
       } while (anio > 0 && anio >= 3000);
         
       Date fecha1 = new Date(anio - 1900, mes - 1, dia);
      d1.setFechaR(fecha1);
       
    
       return d1;
   }
    
    public void comparar(Fechas d1){
     Date hoy= new Date();
    int antiguedad = hoy.getYear() - d1.getFechaR().getYear();
    System.out.println("Diferencia entre años = " + antiguedad);     
        
    }
    
}
