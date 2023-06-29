/*
Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. 
Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package Entidades;

import java.util.ArrayList;


public class Polizas {
    
    private Vehiculos vehiculos;
    private Clientes clientes;
    private int numeroPoliza;
    private Cuotas Cuotas ;
    private String formaPagos;
    private double montoTotal;
    private boolean granizo;
    private String tipoCobertura;

    public Polizas() {
    }

    public Polizas(Vehiculos vehiculos, Clientes clientes, int numeroPoliza, Cuotas Cuotas, String formaPagos, double montoTotal, boolean granizo, String tipoCobertura) {
        this.vehiculos = vehiculos;
        this.clientes = clientes;
        this.numeroPoliza = numeroPoliza;
        this.Cuotas = Cuotas;
        this.formaPagos = formaPagos;
        this.montoTotal = montoTotal;
        this.granizo = granizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Cuotas getCuotas() {
        return Cuotas;
    }

    public void setCuotas(Cuotas Cuotas) {
        this.Cuotas = Cuotas;
    }

    public String getFormaPagos() {
        return formaPagos;
    }

    public void setFormaPagos(String formaPagos) {
        this.formaPagos = formaPagos;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Polizas{" + "vehiculos=" + vehiculos + ", clientes=" + clientes + ", numeroPoliza=" + numeroPoliza + ", Cuotas=" + Cuotas + ", formaPagos=" + formaPagos + ", montoTotal=" + montoTotal + ", granizo=" + granizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
    
    
}
