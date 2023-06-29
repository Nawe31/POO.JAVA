/*Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
package Entidades;

/**
 *
 * @author nahue
 */
public class Vehiculos {
    
    private String marca;
    private int anio;
    private int numeroMotor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculos() {
    }

    public Vehiculos(String marca, int anio, int numeroMotor, String chsis, String color, String tipo) {
        this.marca = marca;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chsis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChsis() {
        return chasis;
    }

    public void setChsis(String chsis) {
        this.chasis = chsis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chsis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
