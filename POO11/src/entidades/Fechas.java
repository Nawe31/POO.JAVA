/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


import java.util.Date;

/**
 *
 * @author nahue
 */
public class Fechas {
    
    private Date fechaR;

    public Fechas() {
    }

    public Fechas(Date fechaR) {
        this.fechaR = fechaR;
    }

    public Date getFechaR() {
        return fechaR;
    }

    public void setFechaR(Date fechaR) {
        this.fechaR = fechaR;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Date{");
        sb.append("fechaRegistrada=").append(fechaR);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
