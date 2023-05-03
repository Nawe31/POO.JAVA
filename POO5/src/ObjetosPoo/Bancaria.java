/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
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
package ObjetosPoo;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Bancaria {
    
    private int NumeroCuenta;
    private int dni;
    private int saldo;

    public Bancaria() {
    }

    public Bancaria(int NumeroCuenta, int dni, int saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
   public void datos(){
   
       Scanner leer = new Scanner( System.in);
       
       System.out.println("ingrese numero de cuenta");
       NumeroCuenta=leer.nextInt();
       System.out.println(" ingrese su dni");
       dni = leer.nextInt();
      
       saldo= 60000;
       
       
   } 
   
   public double ingreso(int saldo){
    double total;   
    double ingreso = 0;
        Scanner read = new Scanner( System.in);
       System.out.println(" ingrese el monto para agregar");
       ingreso = read.nextDouble();
    
        total = saldo + ingreso;
       System.out.println(" el total agregado es"+ total);
       return(total);
   }
   
   public double retirar (int saldo){
       
       double retirar;
       double aux;
       Scanner read = new Scanner( System.in);
       System.out.println(" ingrese el monto para debitar");
      retirar = read.nextDouble();
       
       if ( retirar > saldo ){
       
           System.out.println(" no posee monto para retirar");
       }
       else {
           
           System.out.println(" se debitaron : "+retirar+" de su cuenta, su monto actual es de "+( saldo -retirar) );
         
                            
       }
            aux = (saldo-retirar);
    return(aux);
   }
   
   public double ExtraccionRapida(int saldo){
       
       double ExtraccionRapida=0;
       
       if( saldo > 10){
       
       System.out.println("se debitara su 20% ");
   
       ExtraccionRapida = (saldo - ( saldo*0.20));
       
           System.out.println(" en su cuenta le queda "+ ExtraccionRapida);
   } else{
           System.out.println("no cuenta con el monto suficiente");
           }
     
   
     return(ExtraccionRapida);
   }
   
   public void consultarSaldo(int saldo){
       
   
       System.out.println(" su saldo es "+saldo);
       
   }
   
   public void consultarDatos(int NumeroCuenta,int dni, int saldo){
   
       System.out.println(" su numero de cuenta es "+ NumeroCuenta);
       System.out.println(" su numero de dni es "+ dni);
       System.out.println(" su saldo es "+ saldo);
       
       
   }
   
   
    
    
}
