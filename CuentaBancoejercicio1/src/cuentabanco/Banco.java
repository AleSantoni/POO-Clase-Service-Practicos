/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco;

import cuentabanco.Servicio.CuentaBancariaServicio;
import cuentabanco.entidad.CuentaBanco;
import java.util.Scanner;

/**
 *
 * @author BeluS
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();

        CuentaBanco cuenta = cbs.crearCuenta();
        int opc;
        do {
            System.out.println("*********BIENVENIDO BANCO **************");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Mostrar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            System.out.println("Digite la opcion deseada ->");
            opc = leer.nextInt();
            switch (opc) {
                case 1:

                    cuenta.setSaldoActual(cbs.ingresar(cuenta.getSaldoActual()));
                    System.out.println("El slado en cuenta es " + cuenta.getSaldoActual());
                    break;
                case 2:

                    cuenta.setSaldoActual(cbs.retirar(cuenta.getSaldoActual()));
                    System.out.println("El slado en cuenta es " + cuenta.getSaldoActual());
                    break;
                case 3:
                    cuenta.setSaldoActual(cbs.extraccionRapida(cuenta.getSaldoActual()));
                    break;

                case 4:
                    cbs.mostarSaldo(cuenta);
                    break;

                case 5:
                    System.out.println(cbs.consultarDatos(cuenta));
                    break;
                case 6:
                    System.out.println("Gracias por operar con banco ");
                    break;

                default:
                    System.out.println("Opcion ingresada no valida intente nuevamente ");

            }

        } while (opc != 6);

    }

}
