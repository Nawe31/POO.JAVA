

import Entidades.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){


        Scanner leer = new Scanner(System.in);
        System.out.println( " precione la opcion correcta");
        System.out.println( "----> 1 para calcurar el arear de un circulo");
        System.out.println( "----> 2 para calcurar el perimetro de un circulo");
        System.out.println( "----> 3 para calcurar el arear de un rectangulo");
        System.out.println( "----> 4 para calcurar el perimetro de un rectangulo");
        int num = leer.nextInt();


        Circulo a1 = new Circulo();
        Triangulo t1 = new Triangulo();

        switch (num){
            case 1:
                a1.calcularArea();
                break;

                case 2:
                    a1.calcularPerimetro();
                break;

                case 3:
                t1.calcularArea();
                break;

                case 4:
                    t1.calcularPerimetro();
                    break;

        }

    }
}