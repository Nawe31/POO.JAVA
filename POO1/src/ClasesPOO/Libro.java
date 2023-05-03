/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ClasesPOO;

import java.util.Scanner;


public class Libro {
    
    private String titulo;
    private String autor;
    private int pagina;
    private int isbm;

    public Libro() {
    }

    public Libro(String titulo, String autor, int pagina, int isbm) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
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

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getIsbm() {
        return isbm;
    }

    public void setIsbm(int isbm) {
        this.isbm = isbm;
    }
    
    
    public void informacion(){
      
       Scanner leer = new Scanner(System.in);
       Scanner read = new Scanner(System.in);
       
        System.out.println(" ingrese titulo del libro");
        titulo = leer.nextLine();
        System.out.println(" ingrese nombre del autor");
        autor = leer.nextLine();
        System.out.println(" ingrese cuantas paginas tiene el libro");
        pagina = read.nextInt();
        System.out.println(" ingrese codigo de isbm");
        isbm = read.nextInt();
    }
    
    public void MostrarInformacion(){
    
        System.out.println("el titulo del libro es: "+ titulo + " el autor es : "+ getAutor()+" las paginas que tiene el libro son : "+ getPagina()+" el codigo isbm es : " + isbm );
    
    }
    
    
}
