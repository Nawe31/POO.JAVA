/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
 */
package Entidades;

/**
 *
 * @author nahue
 */
public class Lavadoras extends Electrodomesticos{
    
    private Integer carga;
    
    public Lavadoras(){
    
    }

    public Lavadoras(Integer carga) {
        this.carga = carga;
    }

    public Lavadoras(Integer carga, int precio, String color, char Consumo, int peso) {
       super(precio,color,Consumo,peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
   
}
