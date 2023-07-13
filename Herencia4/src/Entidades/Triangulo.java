package Entidades;

import java.util.Scanner;

/* Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/
public class Triangulo implements  Informacion{

private double base;
private double altura;


    public Triangulo() {
    }

    @Override
    public void calcularArea() {
        Scanner leer = new Scanner(System.in);
        System.out.println( " ingrese la base del rectangulo");
        this.base = leer.nextDouble();
        System.out.println( "ingrese la altura del rectangulo");
        this.altura = leer.nextDouble();

        System.out.println(" el area del rectangulo es : "+( base * altura));



    }

    @Override
    public void calcularPerimetro() {
        Scanner leer = new Scanner(System.in);
        System.out.println( " ingrese la base del rectangulo");
        this.base = leer.nextDouble();
        System.out.println( "ingrese la altura del rectangulo");
        this.altura = leer.nextDouble();

        System.out.println(" el perimetro de unrectangulo es : "+(( base * altura)*2));


    }
}
