/*
Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author nahue
 */
public class Cuotas {

    private int numeroCuota;
    private double montoTotal;
    private boolean pago;
    private LocalDate vencimiento;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(int numeroCuota, double montoTotal, boolean pago, LocalDate vencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotal = montoTotal;
        this.pago = pago;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numeroCuota=" + numeroCuota + ", montoTotal=" + montoTotal + ", pago=" + pago + ", vencimiento=" + vencimiento + ", formaPago=" + formaPago + '}';
    }
    

    
    
}
