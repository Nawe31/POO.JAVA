/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package poo5;

import ObjetosPoo.Bancaria;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Bancaria op = new Bancaria();
        
        
        
        System.out.println(" elija la operacion que desee  ");
        System.out.println("  1 --- PARA INGRESAR DINERO----");
        System.out.println("  2 --- PARA RETIRAR DINERO----");
        System.out.println("  3 --- EXTRACCION RAPIDA---");
        System.out.println("  4 --- CONSULTAR SALDO ---");
        System.out.println("  5 --- CONSULTAD DATOS---");
        
        
        int num = leer.nextInt();
        
        switch(num){
        
            case 1:{
            op.datos();
            op.ingreso(op.getSaldo());
            break;
            }
            
            case 2:{
            op.datos();
            op.retirar(op.getSaldo());
             break;   
            }
            
            case 3:{
            op.datos();
            op.ExtraccionRapida(op.getSaldo());
            break;
            }
            
            case 4:{
            op.datos();
            op.consultarSaldo(op.getSaldo());
            break;
            }
            
            case 5:{
                
                op.datos();
                op.consultarDatos(op.getNumeroCuenta(),op.getDni(),op.getSaldo());
            break;
            }
        
        
        }
    }
    
}
