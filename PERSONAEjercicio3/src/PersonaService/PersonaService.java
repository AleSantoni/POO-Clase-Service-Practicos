/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaService;

import java.util.Scanner;
import persona.entidades.Persona;

/**
 *
 * @author BeluS
 */
public class PersonaService {
    Scanner leer =new Scanner(System.in);

        public Persona crearPersona(Persona persona){
        
        System.out.println("Digite el nombre de la persona ->");
     String nombre =leer.next();
     persona.setNombre(nombre);
        System.out.println("Digite la edad ->");
      int edad=leer.nextInt();
      persona.setEdad(edad);
        boolean verificador =false;
       String sexo="";
        do {
             System.out.println("Digite el sexo H para hombre/ M para mujer / O para otro genero");
             String opcion=leer.next();
             if(opcion.equalsIgnoreCase("H")||opcion.equalsIgnoreCase("M")|| opcion.equalsIgnoreCase("O")){
             sexo=opcion;
             persona.setSexo(sexo);
              verificador=true;
             } else{
                 System.out.println("Caracter ingresado incorrecto");
             }
        } while (!verificador);
        
            System.out.println("Digite el peso->");
            double peso=leer.nextDouble();
            persona.setPeso(peso);
        
         System.out.println("Digite la altura->");
            double altura =leer.nextDouble();
            persona.setAltura(altura);
            return new Persona(nombre,edad,sexo,peso,altura);
        }
    /*
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
    */
    public int calcularImc(Persona persona){
    int peso=0;
     
    double imc=(persona.getPeso()/(persona.getAltura()*persona.getAltura()));
    if (imc < 20 ){
        peso=-1;
    }else if(imc >=20 && imc <=25){
        peso=0;
    }else if (imc > 25){
        peso=1;

    }
return peso;
    }

    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La funció devuelve un booleano.
    public boolean esMayorDeEdad(Persona persona) {

        return persona.getEdad() >= 18;

    }
  public void mostrarDatos(Persona persona){
      System.out.println( "Persona = " +persona.getNombre()+ " Edad = "+persona.getEdad()+" Sexo  = "+persona.getSexo()+" Peso =  "+persona.getPeso()+" Altura = "+persona.getAltura());

  
               
    }
  
  public void porcentajePeso(int [] imc){
        int pesoideal=0;
        int sobrepeso=0;
        int pesobajo=0;
       
     for (int i = 0; i < imc.length; i++) {
          if(imc[i]==-1){
              pesobajo+=1;
              
          
              
          }else if (imc[i]==0){
              pesoideal+=1;
          }else if (imc[i]==1){
              sobrepeso+=1;
          }
          
      }
      System.out.println("El porcentaje de Persona con peso bajo es "+ pesobajo*100/imc.length + " % ");
       System.out.println("El porcentaje de Persona con peso ideal es "+ pesoideal*100/imc.length + " % ");
        System.out.println("El porcentaje de Persona con Sobrepeso  es "+ sobrepeso*100/imc.length + " % ");
      
      
  }
  public void porcentajeEdad(boolean[] Edades){
      int mayor=0;
      int menor=0;
      for (int i = 0; i < Edades.length; i++) {
          if (Edades[i]==true) {
              mayor+=1;
          }else{
              menor+=1;
          }
      }
      System.out.println("El porcentaje de Persona Mayores de edad  es "+ mayor*100/Edades.length + " % ");
       System.out.println("El porcentaje de Persona Menores de edad es "+ menor*100/Edades.length + " % ");
     
      
  }

  

  
}
