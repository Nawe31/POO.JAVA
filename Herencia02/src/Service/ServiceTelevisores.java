/*
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Service;

import Entidades.Electrodomesticos;
import Entidades.Televisores;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ServiceTelevisores extends ServicioElectrodomesticos {

    public Televisores crearTelevisores() {
        Scanner leer = new Scanner(System.in);
        Electrodomesticos electro = crearElectrodomestico();
        Televisores t1 = new Televisores();
        t1.setColor(electro.getColor());
        t1.setConsumo(electro.getConsumo());
        t1.setPeso(electro.getPeso());
        t1.setPrecio(electro.getPrecio());
        System.out.println(" ingrese la pulgada de la tv");
        t1.setResolucion(leer.nextInt());
        System.out.println(" tiene sintonizador S/N");
        String resp = leer.next();

        if (resp.equalsIgnoreCase("N")) {

            t1.setTdt(true);
        } else {
            t1.setTdt(false);
        }

        return t1;

    }

    public void precioFinal(Televisores t1) {
        super.precioFinal(t1);

        if (t1.getResolucion() > 40) {

            t1.setPrecio((int)(t1.getPrecio()*1.3));
        }
        if (t1.isTdt()) {

            t1.setPrecio(t1.getPrecio() + 500);
        }

        
        System.out.println(" el precio final es "+ t1.getPrecio());
    }

}
