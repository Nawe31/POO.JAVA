/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Rectangulo;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Rectangulo {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    public void datos(){
        
        double rectangulo; 
        
         Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese el valor de la base");
        base = leer.nextDouble();
        System.out.println(" ingrese el valor de la altura");
        altura = leer.nextDouble();
          
        
    }
    
    public void superficie(){
        
        double superficie;
        
        superficie = (base*altura);
          System.out.println(" la superficie es " + superficie);
    }
    
    public void perimetro(){
    double perimetro;
    
    perimetro = ((base*altura)*2);
    
        System.out.println(" el perimero es "+ perimetro);
    
    }
    
    public void Dibujar(){
    
    
               for (int i = 1; i < base; i++) {
            
            System.out.println("*");
            
            for (int j = 0; j < altura; j++) {
                
                if ( i > j){
                    System.out.print("*");
                }
                
            }
        
    }
}
}
