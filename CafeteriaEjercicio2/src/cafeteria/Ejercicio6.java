/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import ServicioCafeteria.ServicioCafeteria;
import cafetera.entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author BeluS
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       ServicioCafeteria c1=new  ServicioCafeteria();
       Cafetera cafe=new Cafetera();

        int opc;
        do {
            System.out.println("**********CAFETERA**********");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe ");
            System.out.println("5. Salir");
            System.out.println("Eliga la opcion deseada");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
         c1.llenarCafetera(cafe);

                    break;
                case 2:
                    System.out.println("Digite el tamañio de la taza ");
                    double tamanio=leer.nextDouble();
                 c1.servirTaza(cafe, tamanio);

                    break;
                case 3:
                    c1.vaciarCafetera(cafe);

                    break;
                case 4:
                    System.out.println("Digite la cantidad de cafe a ingresar en la maquina ->");
                    double cantidad=leer.nextDouble();
                    c1.agregarCafe(cafe, cantidad);
                

                    break;
                case 5:
                    System.out.println("Gracias que tenga un buen dia Disfrute su Cafe ");
                    break;

                default:
                    System.out.println("Opcion ingresada Incorrecta");
            }

        } while (opc != 5);
        
      
       
       
       
       

    }
    
}
