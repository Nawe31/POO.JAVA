/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ServiceProducto {

    HashMap<Integer, Producto> productos = new HashMap();

    public void crearProducto() {

        Scanner leer = new Scanner(System.in);
        boolean confi = true;

        do {

            System.out.println(" ingrese la key de su producto");
            int key = leer.nextInt();
            System.out.println(" ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println(" ingrece precio del producto");
            int precio = leer.nextInt();

            productos.put(key, new Producto(nombre, precio));

            System.out.println(" decea agregar un nuevo producto? S/N");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("N")) {

                confi = false;

            }

        } while (confi);

        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer key = entry.getKey();
            Producto value = entry.getValue();

            System.out.println("---------------------------");
            System.out.println(" la key del produto es " + key);
            System.out.println(" el value es " + value);
            System.out.println("---------------------------");

        }

    }

    public void borrarProducto() {
        Scanner read = new Scanner(System.in);

        System.out.println(" ingrese la key del producto a remover");
        int remover = read.nextInt();

        if (remover == 0) {
            System.out.println(" producto no encontrado ");
        }

        productos.remove(remover);

        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer key = entry.getKey();
            Producto value = entry.getValue();

            System.out.println("nueva lista"+ entry);
        }

    }
}
