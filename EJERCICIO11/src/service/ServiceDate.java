package service;

import java.util.Date;
import java.util.Scanner;
import model.DateReg;

public class ServiceDate {

    public DateReg crearFecha2(){
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println(" ingrese el dia");
        dia = leer.nextInt();
        System.out.println(" ingrese el mes");
        mes = leer.nextInt();
        System.out.println(" ingrese el anio");
        anio = leer.nextInt();

        Date aux2 = new Date(anio - 1900, mes - 1, dia);
        return new DateReg(aux2);

    }

    public DateReg crearFecha() {
        Scanner leer = new Scanner(System.in);
        DateReg dr = new DateReg();
        int dia, mes, anio;

        System.out.println(" ingrese el dia");
        dia = leer.nextInt();
        System.out.println(" ingrese el mes");
        mes = leer.nextInt();
        System.out.println(" ingrese el añio");
        anio = leer.nextInt();

        Date aux = new Date(anio - 1900, mes - 1, dia);
        dr.setFechaReg(aux);

        return dr;
    }

    public void compararAnio(DateReg rg) {

        Date fechaHoy = new Date();
        int antiguedad = fechaHoy.getYear() - rg.getFechaReg().getYear();

        System.out.println(" la diferencia entre los 2 años es : " + antiguedad);

    }

  

}
