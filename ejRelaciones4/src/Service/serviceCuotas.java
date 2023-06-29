/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cuotas;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class serviceCuotas {

    public Cuotas crearCuotas() {
        Cuotas cuotas = new Cuotas();
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese el monto a pagar");
        System.out.println("ingrese el numero de cuota 1/12");
        cuotas.setPago(true);
        int num = leer.nextInt();
        switch (num) {

            case 1:
                cuotas.setVencimiento(LocalDate.of(2023, Month.JANUARY, 13));
                break;
            case 2:
                cuotas.setVencimiento(LocalDate.of(2023, Month.FEBRUARY, 13));
                break;
            case 3:
                cuotas.setVencimiento(LocalDate.of(2023, Month.MARCH, 13));
                break;
            case 4:
                cuotas.setVencimiento(LocalDate.of(2023, Month.APRIL, 13));
                break;
            case 5:
                cuotas.setVencimiento(LocalDate.of(2023, Month.MAY, 13));
                break;
            case 6:
                cuotas.setVencimiento(LocalDate.of(2023, Month.JUNE, 13));
                break;
            case 7:
                cuotas.setVencimiento(LocalDate.of(2023, Month.JULY, 13));
                break;
            case 8:
                cuotas.setVencimiento(LocalDate.of(2023, Month.AUGUST, 13));
                break;
            case 9:
                cuotas.setVencimiento(LocalDate.of(2023, Month.SEPTEMBER, 13));
                break;
            case 10:
                cuotas.setVencimiento(LocalDate.of(2023, Month.OCTOBER, 13));
                break;
            case 11:
                cuotas.setVencimiento(LocalDate.of(2023, Month.NOVEMBER, 13));
                break;
            case 12:
                cuotas.setVencimiento(LocalDate.of(2023, Month.DECEMBER, 13));
                break;

        }

        System.out.println(" su cuota vence el dia " + cuotas.getVencimiento());

        System.out.println(" ingrese su forma de pago");
        cuotas.setFormaPago(leer.next());
        return cuotas;
    }

    public boolean informePago() {
        Cuotas cuotas = new Cuotas();
        LocalDate fechaActuar = LocalDate.now();

        if (cuotas.getVencimiento().isBefore(fechaActuar)) {
            cuotas.setPago(false);
            System.out.println(" su cuota esta impaga");

        }
        
        return cuotas.isPago();

    }

}
