/*


En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:


Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceAlumnos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> CrearAlumnos() {
        ArrayList<Alumno> Alumnos = new ArrayList();
        boolean confirmacion = true;
        do {
            Alumno alumno = new Alumno();
            System.out.println(" ingrese el nombre del alumno");
            alumno.setAlumno(leer.next());
            System.out.println(" ingrese nota del alumno");
            ArrayList<Integer> nota = new ArrayList();
            for (int i = 0; i < 3; i++) {

                nota.add(leer.nextInt());
            }
            alumno.setNota(nota);
            Alumnos.add(alumno);

            System.out.println(" decea ingresar otros alumnos S/N");
            String resultado = leer.next();
            if (resultado.equalsIgnoreCase("N")) {
                confirmacion = false;
            }

        } while (confirmacion);
        return Alumnos;

    }

    public double buscarAlumno(ArrayList<Alumno> Alumnos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" ingrese el nombre del alumno a buscar");
        String AlumBuscar = leer.next();
        Iterator<Alumno> it = Alumnos.iterator();
        
        while (it.hasNext()) {
            Alumno AlumnoAux = it.next();
            if (AlumnoAux.getAlumno().equalsIgnoreCase(AlumBuscar)) {
                System.out.println("el promedio es "+ promedio(AlumnoAux));
             return promedio(AlumnoAux);
                
            }

        }
        System.out.println(" no se econtro el alumno");
              return 0;
    }

    public double promedio(Alumno alumno) {
        double SumarNotas = 0;
        for (Integer nota : alumno.getNota()) {

            SumarNotas += nota;

        }

       return SumarNotas / alumno.getNota().size();
      
    }

}
