/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Pais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class servicePaises {

    public static void main(String[] args) {

    }

    ArrayList<Pais> paises = new ArrayList();

    public void CrearPaises() {
        Scanner leer = new Scanner(System.in);
        boolean confi = true;

        do {
            System.out.println(" ingrese el nombre del pasis");
            String ap = leer.next();

            paises.add(new Pais(ap));

            System.out.println(" decea agregar otro pasais S/N ? ");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("N")) {

                confi = false;
            }

        } while (confi);

        for (Pais p : paises) {
            System.out.println(p);
        }

    }

    public void ordenarPais() {
        
      
    //el orden normal es 
        Collections.sort(paises);

        System.out.println(" lista ordenada "+paises);
        
        //orden inverso
        Collections.sort(paises, Collections.reverseOrder());
        System.out.println( "el orden inverso es "+paises);
    }

    public void borrarPais() {
        Scanner read = new Scanner(System.in);
        System.out.println(" ingrese el pais a borrar");
        String borrar = read.next();
        
        paises.sort(Comparator.comparing(Pais::getPaises));
       List<Pais> paisList = paises.stream().filter(Pais ->! Pais.getPaises().equalsIgnoreCase(borrar)).sorted(Comparator.comparing(Pais::getPaises)).collect(Collectors.toList());
       
       
        System.out.println("la nueva lista es  "+paisList);
        

}

}
