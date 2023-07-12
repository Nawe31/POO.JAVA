/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package herencia02;

import Entidades.Electrodomesticos;
import Entidades.Lavadoras;
import Entidades.Televisores;
import Service.LavadoraServicios;
import Service.ServiceTelevisores;
import java.util.ArrayList;
import java.util.Scanner;


public class Herencia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ServiceTelevisores st = new ServiceTelevisores();
        LavadoraServicios sl = new LavadoraServicios();

        ArrayList<Electrodomesticos> elec = new ArrayList();

        int total = 0;

        for (int i = 0; i < 4; i++) {

            System.out.println(" ingrese 1 para compra de tv, 2 para compra de lavarropas");
            int numero = leer.nextInt();

            switch (numero) {
                case 1:
                    Televisores tele = st.crearTelevisores();
                    st.precioFinal(tele);
                    elec.add(tele);
                    break;
                case 2:
                    Lavadoras lava = sl.crearLavadoras();
                    sl.precioFinal(lava);
                    elec.add(lava);
                    break;
            }

        }

        for (Electrodomesticos aux : elec) {

            total = total + aux.getPrecio();

        }
        System.out.println(" el total es " + total);

    }

}
