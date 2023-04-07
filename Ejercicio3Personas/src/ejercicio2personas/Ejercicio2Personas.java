/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2personas;

import ejercicio2personas.entidad.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author BeluS
 */
public class Ejercicio2Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
    
        Persona persona1=new Persona();
        persona1.cargarDatos();
       
        int dato=persona1.calcularIMC(persona1);
        System.out.println(dato);
        if(dato==1){
            System.out.println("La Persona tiene deficit en su peso");
        }else if (dato==0){
            System.out.println("La persona tiene su peso ideal ");
            
        }else{
            System.out.println("La persona se encuentra con sobrepeso");
        }
        boolean verifedad=persona1.esMayorDeEdad();
        if(verifedad==true){
            System.out.println("La persona es MAyor de edad");
        }else{
            System.out.println("La persona es Menor de edad ");
        }
        
        System.out.println(persona1.toString());
    }
    
}
