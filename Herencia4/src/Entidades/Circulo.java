package Entidades;

import java.util.Scanner;

/*    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. */
public class Circulo implements Informacion {

private double radio;
private double diametro;


    @Override
    public void calcularArea() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese el radio");
        this.radio = leer.nextDouble();

        System.out.println( " el area es "+ ((3.14) * radio * 2));
    }

    @Override
    public void calcularPerimetro() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese el diametro");
        this.diametro = leer.nextDouble();


        System.out.println( " el area es "+ ( 3.14 * diametro));

    }

    public Circulo() {

    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
