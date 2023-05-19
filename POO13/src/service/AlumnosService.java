/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import model.Curso;

/**
 *
 * @author nahue
 */
public class AlumnosService {

    Scanner leerString = new Scanner(System.in).useDelimiter("\n");
    Scanner leerInt = new Scanner(System.in).useDelimiter("\n");
    Scanner leerDouble = new Scanner(System.in).useDelimiter("\n");
    Curso dp = new Curso();

    public Curso crearCurso() {

        System.out.println(" ingrese el nombre del curso");
        dp.setNombreCurso(leerString.nextLine());
        System.out.println(" ingrese cantidad de horas por dia");
        dp.setCantidadHorasPorDia(leerInt.nextInt());
        System.out.println(" ingrese cantidad de dias por semana");
        dp.setCantidadDiasPorSemana(leerInt.nextInt());
        System.out.println(" registrar el turno si es mañana o tarde");
        dp.setTurno(leerString.nextLine());
        System.out.println(" registrar el precio por hora");
        dp.setPrecioPorHora(leerDouble.nextDouble());
        cargarAlumnos();

        return dp;
    }

    public void cargarAlumnos() {
        String[] alum = new String[5];

        System.out.println(" ingrese los nombre de los alumnos ");

        for (int i = 0; i < alum.length; i++) {

            System.out.println(" dato numero :" + (i + 1));
            alum[i] = leerString.next();

        }
        dp.setAlumnos(alum);

    }

    public double calcularGananciaSemanal(Curso c1) {

        int cantAlum = 0;

        String[] alum = new String[5];

        alum = c1.getAlumnos();

        for (int i = 0; i < alum.length; i++) {

            if (alum[i] != null && !alum[i].isEmpty()) {

                cantAlum++;
            }

        }

        double aux = c1.getCantidadDiasPorSemana() * c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * cantAlum;

        return aux;

    }

}
