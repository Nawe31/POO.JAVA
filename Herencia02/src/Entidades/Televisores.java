/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
 */
package Entidades;

/**
 *
 * @author nahue
 */
public class Televisores extends Electrodomesticos{
    
    private Integer resolucion;
    private boolean tdt;
    
   

    public Televisores() {
    }

    public Televisores(Integer resolucion, boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisores(Integer resolucion, boolean tdt, int precio, String color, char Consumo, int peso) {
        super(precio, color, Consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisores{" + "resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }
    
  


    
}
