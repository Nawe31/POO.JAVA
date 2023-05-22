/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Model;

/**
 *
 * @author nahue
 */
public class Libro {

    private String isbm;
    private String titulo;
    private String autor;
    private int npag;

    public Libro() {
    }

    public Libro(String isbm, String titulo, String autor, int npag) {

        this.isbm = isbm;
        this.titulo = titulo;
        this.autor = autor;
        this.npag = npag;

    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpag() {
        return npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbm=" + isbm + ", titulo=" + titulo + ", autor=" + autor + ", npag=" + npag + '}';
    }

}
