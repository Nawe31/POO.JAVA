/*
 Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 */
package Entidades;

/**
 *
 * @author nahue
 */
public class Clientes {
    private String nombre;
    private String apellido;
    private int documento;
    private String domicilio;
    private String mail;
    private int telefono;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, int documento, String domicilio, String mail, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.domicilio = domicilio;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", domicilio=" + domicilio + ", mail=" + mail + ", telefono=" + telefono + '}';
    }
    
    
    
}
