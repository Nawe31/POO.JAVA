/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Service;

import Model.Libro;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ServiceLibro {

    Scanner leer = new Scanner(System.in);
    Scanner read = new Scanner(System.in);

    public Libro crearLibro() {

        Libro d1 = new Libro();

        System.out.println(" ingrese el ISMB");
        d1.setIsbm(leer.next());
        System.out.println("ingrese titulo del libro");
        d1.setTitulo(leer.next());
        System.out.println(" ingrese autor del libro");
        d1.setAutor(leer.next());
        System.out.println(" ingrese numero de paginas");
        d1.setNpag(read.nextInt());

        return d1;
    }

    public void mostrarLibro(Libro d1) {

        System.out.println(" el isbm del libro es : " + d1.getIsbm());
        System.out.println(" el titulo del libro es : " + d1.getTitulo());
        System.out.println(" el autor del libro es : " + d1.getAutor());
        System.out.println(" el libro cuenta con paginas : " + d1.getNpag());

    }

}
