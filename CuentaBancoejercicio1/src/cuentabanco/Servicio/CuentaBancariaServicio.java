/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco.Servicio;


import cuentabanco.entidad.CuentaBanco;
import java.util.Scanner;

/**
 *Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
* Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.


 * @author BeluS
 */
public class CuentaBancariaServicio {
    private final  Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBanco crearCuenta(){
        
        System.out.println("Digite el numero de cuenta ");
        int numeroCuenta=leer.nextInt();
        System.out.println("Digite el numero de dni ");
        long dni=leer.nextLong();
        System.out.println("Digite el saldo en la cuenta ");
        double saldo=leer.nextDouble();
        
        return new CuentaBanco(numeroCuenta, dni, saldo);   
    }
    
    public double ingresar(double saldo){
        
        System.out.println("Digite el monto a ingresar");
        double ingresar=leer.nextDouble();
        
        saldo+=ingresar;
        
        return saldo;
    }
    public double retirar(double saldo){
        System.out.println("Ingrese la cantidad de dinero a retirar->");
        double retirar=leer.nextDouble();
        if (retirar<saldo) {
            saldo-=retirar;
            return saldo;
            
        }else{
            retirar=saldo;
            saldo-=retirar;
            System.out.println("No se entrego la totalidad del monto ingresado ");
            return saldo;
            
            
        }
    }
        public double extraccionRapida(double saldo){
            System.out.println("Ingrese el monto de extraccion rapida solamente le entregara el 20% del dinero en   cuenta  ");
            double retiro=leer.nextDouble();
            if (retiro<(saldo*0.20)) {
                retiro=saldo*0.20;
                saldo-=retiro;
                return saldo;
                
                
            }else{
                System.out.println("El monto ingresado es mayor que el 20% del saldo en cuenta ");
                return saldo;
            }  
        }
      
        public void mostarSaldo(CuentaBanco cuenta){
            System.out.println("El saldo en cuenta es : "+cuenta.getSaldoActual());
        }
        
        public String consultarDatos(CuentaBanco cuenta){
                 return "CuentaBanco{" + "Numero de Cuenta=" + cuenta.getNumeroCuenta() + ", DNI= " + cuenta.getDniCliente()+ ", Saldo Actual = " + cuenta.getSaldoActual() +  '}';
    }
           
            
            
            
        }




    

   

