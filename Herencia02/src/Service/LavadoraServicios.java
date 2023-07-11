/*
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package Service;

import Entidades.Electrodomesticos;
import Entidades.Lavadoras;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class LavadoraServicios extends ServicioElectrodomesticos {

    public Lavadoras crearLavadoras() {
        Scanner leer = new Scanner(System.in);
        Electrodomesticos electro = crearElectrodomestico();
        Lavadoras l1 = new Lavadoras();
        l1.setColor(electro.getColor());
        l1.setConsumo(electro.getConsumo());
        l1.setPeso(electro.getPeso());
        l1.setPrecio(electro.getPrecio());

        System.out.println(" ingrese La carga de lavadora");
        l1.setCarga(leer.nextInt());
         
        
        return l1;

    }

 public void precioFinal(Lavadoras l1 ){
  super.precioFinal(l1);
     if(l1.getCarga()> 30){
     l1.setPrecio(l1.getPrecio()+500);
     }
   
 
 }

}
