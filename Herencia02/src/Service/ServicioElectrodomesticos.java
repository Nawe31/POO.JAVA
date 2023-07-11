/*

• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
 */
package Service;

import Entidades.Electrodomesticos;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ServicioElectrodomesticos {

    public char comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        } else {
            return 'F';
        }

    }

    public String comprobarColor(String color) {
        if ("blanco".equals(color) || "negro".equals(color) || "azul".equals(color) || "gris".equals(color)) {
            return color;
        } else {
            return "blanco";
        }
    }

    public Electrodomesticos crearElectrodomestico() {
        Electrodomesticos e1 = new Electrodomesticos();
        Scanner leer = new Scanner(System.in);
          Scanner read = new Scanner(System.in);
        System.out.println(" ingrese el precio del electrodomoestico");
        e1.setPrecio(leer.nextInt());
        System.out.println(" el color de su electrodomestico");
        e1.setColor(read.nextLine());
        comprobarColor(e1.getColor());
        System.out.println(" ingrese el consumo de su electrodomestico");
        e1.setConsumo(leer.next().charAt(0));
        comprobarConsumoEnergetico(e1.getConsumo());
        System.out.println(" ingrese su peso");
        e1.setPeso(leer.nextInt());

        return e1;

    }

    /*
    
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    public void precioFinal(Electrodomesticos e1) {
        
          
        switch (e1.getConsumo()) {
            case 'A':
                e1.setPrecio(e1.getPrecio()+1000);
                break;
            case 'B':
                e1.setPrecio(e1.getPrecio()+800);
                break;
            case 'C':
                 e1.setPrecio(e1.getPrecio()+600);
                break;
            case 'D':
                 e1.setPrecio(e1.getPrecio()+500);
                break;
            case 'E':
                 e1.setPrecio(e1.getPrecio()+300);
                break;
            case 'F':
                 e1.setPrecio(e1.getPrecio()+100);
                break;
        }
        
      if(e1.getPeso() >= 1 && e1.getPeso()<= 19){
    
        e1.setPrecio(e1.getPrecio()+100);
    }
      else if (e1.getPeso() >= 20 && e1.getPeso()<= 49)
        
      {  e1.setPrecio(e1.getPrecio()+500);
        }
     else if (e1.getPeso() >= 50 && e1.getPeso()<= 79)
        
     { e1.setPrecio(e1.getPrecio()+800);
        }
     else 
         { e1.setPrecio(e1.getPrecio()+1000);
        }


    }

}


