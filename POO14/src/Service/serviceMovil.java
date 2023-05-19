/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Service;

import java.util.Scanner;
import model.Movil;

/**
 *
 * @author nahue
 */
public class serviceMovil {
    
    Scanner leerInt = new Scanner(System.in);
    Scanner leerDouble = new Scanner(System.in);
    Scanner leerString = new Scanner(System.in);
    Movil dp = new Movil();
    
    public Movil CrearMovil() {
        
        System.out.println(" ingrese marca de celular");
        dp.setMarca(leerInt.next());
        System.out.println(" ingrese precio de celular");
        dp.setPrecio(leerDouble.nextDouble());
        System.out.println(" ingrese modelo de celular");
        dp.setModelo(leerString.next());
        System.out.println("ingrese memorai del celular");
        dp.setMemoria(leerInt.nextInt());
        System.out.println("ingrese almacenamiento del celular");
        dp.setMemoria(leerInt.nextInt());
        ingresarCodigo();
        
        return dp;
        
    }
    
    private void ingresarCodigo() {
        int[] mov = new int[7];
        System.out.println(" ingrese el codigo de 7 digitos");
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println(" dato numero" + (i + 1));
            mov[i] = leerInt.nextInt();
            
        }
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println("el codigo es"+mov[i]);
            
        }
        
        dp.setCodigo(mov);
        
    }
    
}
