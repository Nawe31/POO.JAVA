/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package poo7;

import Clases.Persona;
import java.util.Scanner;
import Servicios.PersonaServicios;

/**
 *
 * @author nahue
 */
public class POO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     
        
        Scanner read = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        
        Persona persona[] = new Persona[4];
        
        String nombre;
        int edad;
        int c1=0, c2=0, c3=0;
        int e1=0, e2=0;
        String sexo;
        double peso;
        double altura;
        
        for (int i = 0; i < persona.length; i++) {
            System.out.println("---------------------"+(i+1)+"º-PERSONA---------------------");
            System.out.print("Ingrese el nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese la edad: ");
            edad = read.nextInt();
            System.out.print("Ingrese el género(H-hombre, M-mujer, O-otro): ");
            sexo = leer.nextLine();
            System.out.print("Ingrese el peso: ");
            peso = read.nextDouble();
            System.out.print("Ingrese la altura: ");
            altura = read.nextDouble();
            
            persona[i] = new Persona(nombre, edad, sexo, peso, altura);
            
            System.out.println("---------------------PESO-IDEAL---------------------");
            if (persona[i].calcularIMC(altura, peso)==-1){
                System.out.println("Esta por debajo de su peso ideal.");
                c1++;
            }
            else if (persona[i].calcularIMC(altura, peso)==0){
                System.out.println("Esta en su peso ideal.");
                c2++;
            }
            if (persona[i].calcularIMC(altura, peso)==1){
                System.out.println("Esta persona tiene sobrepeso.");
                c3++;
            }
            System.out.println("-------------------MAYORÍA-DE-EDAD------------------");
            if (persona[i].esMayorDeEdad()){
                System.out.println("La persona es mayor de edad.");
                e1++;
            }else {
                System.out.println("La persona es menor de edad.");
                e2++;
            }
            System.out.println("");
        }
        
        System.out.println("-----------------------INFORME----------------------");
        System.out.println("El "+(25*c1)+"% de las personas esta por debajo de su peso ideal.");
        System.out.println("El "+(25*c2)+"% de las personas esta en su peso ideal.");
        System.out.println("El "+(25*c3)+"% de las personas tienen sobrepeso.");
        System.out.println("----------------------------------------------------");
        System.out.println("El "+(25*e1)+"% de las personas son mayores de edad.");
        System.out.println("El "+(25*e2)+"% de las personas son menores de edad.");
        System.out.println("");
    }
      
    
     
      
      
        }
        
        
          
    
    

