/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package herencia02;

import Entidades.Lavadoras;
import Entidades.Televisores;
import Service.LavadoraServicios;
import Service.ServiceTelevisores;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Herencia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ServiceTelevisores st = new ServiceTelevisores();
        LavadoraServicios sl = new LavadoraServicios();

        System.out.println(" ingrese 1 para compra de tv, 2 para compra de lavarropas");
        int numero = leer.nextInt();

        switch (numero) {
            case 1:
                Televisores tele = st.crearTelevisores();
                st.precioFinal(tele);

                break;
            case 2:
                Lavadoras lava = sl.crearLavadoras();
                sl.precioFinal(lava);

                break;
        }

    }

}
