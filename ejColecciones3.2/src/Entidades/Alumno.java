/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package Entidades;

import java.util.ArrayList;

/**

 */
public class Alumno {
    private String Alumno;
    private ArrayList<Integer> nota;

    public Alumno() {
    }

    public Alumno(String Alumno, ArrayList<Integer> nota) {
        this.Alumno = Alumno;
        this.nota = nota;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Alumno=" + Alumno + ", nota=" + nota + '}';
    }
    
    
    
    
}
