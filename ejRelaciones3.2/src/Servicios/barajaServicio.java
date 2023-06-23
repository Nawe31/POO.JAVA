/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/
package Servicios;
import Entidades.Baraja;
import Entidades.Carta;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class barajaServicio {

    public Baraja CrearBaraja() {
    Baraja baraja = new Baraja();
    ArrayList<Carta> maso = new ArrayList();

    String [] palo = { "copa", "spada","basto","oro"};
        for (int j = 0; j < palo.length; j++) {
        for (int i = 0; i < 12; i++) {
            if(i==8 || i == 9){

                continue;
            }

            maso.add(new Carta(i,palo[j]));
        }
        }
        baraja.setMaso(maso);
        return baraja;

    }

    public void barajar(Baraja baraja){

        System.out.println(" se abarajo el maso");
        Collections.shuffle(baraja.getMaso());
    }

   // • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.


public ArrayList<Carta> siguienteCarta(Baraja baraja) {
    if (baraja.getMaso().isEmpty()) {
        System.out.println(" no hay mas cartas");

        return null;
    }

else {
        ArrayList<Carta> monton = new ArrayList();
        monton.add(baraja.getMaso().remove(0));



    return monton;
}

}

public int cartasDisponibles(Baraja baraja){
        System.out.println(" quedan "+ baraja.getMaso().size() +" disponibles" );
return baraja.getMaso().size();

}

public void darCartas(Baraja baraja ){
        Scanner leer = new Scanner (System.in) ;
        System.out.println( "ingrese cantidad de cartas");
        int Ncart = leer.nextInt();
        if( Ncart > cartasDisponibles(baraja) ) {

            System.out.println("no hay mas cartas");
        }
    for (int i = 0; i < Ncart ; i++) {

        siguienteCarta(baraja);
    }



}

public void cartasMonton(Baraja baraja){

    if (baraja.getMonton().isEmpty()) {

        System.out.println( " no hay cartas");

    }
else {
        System.out.println( baraja.getMaso());
    }


}

public void mostrarBaraja( Baraja baraja) {

    System.out.println(baraja.getMaso());
}








}
