/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:


• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Service;

import Entidades.Pelicula;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ServicePeliculas {

    ArrayList<Pelicula> peliculas = new ArrayList();

    public void crearPeliculas() {
        Scanner leer = new Scanner(System.in);
        boolean confirmar = true;
        do {

            System.out.println(" ingrese el nombre de la pelicula ");
            String titulo = leer.next();
            System.out.println(" ingrese el director de la pelicula ");
            String director = leer.next();
            System.out.println(" ingrese el tiempo de la pelicula");
            int tiempo = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea
            peliculas.add(new Pelicula(titulo, director, tiempo));

            System.out.println(" desea ingresar otra pelicida S/N");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("N")) {
                confirmar = false;
            }

        } while (confirmar);

    }

    public void MostrarPelicula() {

        for (Pelicula pelicula : peliculas) {
            System.out.println(" el listado de pelicias es : " + pelicula);
        }

    }

    public void PeliculasHora() {
        System.out.println(" las peliculas mayores a una hora son");
        for (Pelicula p : peliculas) {

            if (p.getHora() > 1) {
                System.out.println(p);
            }

        }
    }

    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    //pantalla. 
    public void mayorDuracion() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {

                if (t.getHora() > t1.getHora()) {
                    return -1;
                } else if (t.getHora() < t1.getHora()) {
                    return 1;

                } else {
                    return 0;
                }
            }

        });
        System.out.println(" listado de peliculas ordenado de menor a mayor : ");

        for (Pelicula p : peliculas) {

            System.out.println(p);
        }
    }

    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantall
    public void MenorDuracion() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                if (t.getHora() < t1.getHora()) {
                    return -1;
                } else if (t.getHora() > t1.getHora()) {
                    return 1;

                } else {
                    return 0;
                }
            }

        }
        );
        System.out.println(" el orden de menor a mayor es : ");
        
        for (Pelicula p : peliculas) {
            
            System.out.println(p);
            
        }
    }
    
    
    //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
    public void tituloOrden(){
    Collections.sort(peliculas, new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
       return t.getTitulo().compareTo(t1.getTitulo());
            
        }
    });
    
        System.out.println(" Listado de peliculas ordenados por titulo ");
        for (Pelicula p : peliculas) {
            System.out.println(p);
            
        }
    }

    // Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
    public void ordenDirector(){
    Collections.sort(peliculas, new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getDirector());
        }
    
    });
    
        System.out.println(" ordenada alfabeticamente por director es : ");
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    
    }
}
