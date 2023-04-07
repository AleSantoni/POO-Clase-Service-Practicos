/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCafeteria;

import cafetera.entidad.Cafetera;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author BeluS
 */
public class ServicioCafeteria {
    private final Scanner leer=new Scanner(System.in);

    public void  llenarCafetera(Cafetera cafe){
        System.out.println("Digite la capacidad maxima de la Cafetera ->");
  cafe.setCapacidadMaxima(leer.nextDouble());
  cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("]La canidad Actual de cafe en maquina es  " + 
                cafe.getCantidadActual());
        System.out.println("la capacidad maxima es "+cafe.getCapacidadMaxima()+" litros");
      
      
  
 
    }
  /*   Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.    
      */  
      public void servirTaza(Cafetera cafe, double tamanioTaza) {
          double CantidadActual=cafe.getCantidadActual();
         
        
        if (cafe.getCantidadActual() >= tamanioTaza) {
            System.out.println("Sirviendo taza de " + tamanioTaza + " litros de café");
  CantidadActual -= tamanioTaza;
            cafe.setCantidadActual(CantidadActual);
            System.out.println("La Cantidad Acual de cafe en la maquina es   "+cafe.getCantidadActual() +  " Litros");
         
        } else {
            System.out.println("No se puede servir la taza completa porque la cantidad actual de café no es suficiente");
            System.out.println("Se sirve la cantidad restante de " + CantidadActual + " litros de café");
            double taza=tamanioTaza-CantidadActual;
            System.out.println("Le falta  "+ taza + "  litros para llenarse la taza");
        CantidadActual=0;
        cafe.setCantidadActual(CantidadActual);
         
        }
    }
      // Método vaciarCafetera(): pone la cantidad de café actual en cero. 
      public void vaciarCafetera(Cafetera cafe) {
          
        cafe.setCantidadActual(0);
      
          System.out.println("La cantidad de cafe Actual en maquina es : "+ cafe.getCantidadActual());
    }
    //  Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada
      public void agregarCafe(Cafetera cafe ,double cantidad) {
        double  cantidadActual=cafe.getCantidadActual();
        cantidadActual += cantidad;
        if (cantidadActual > cafe.getCapacidadMaxima()) {
            System.out.println("La cantidad agregada de cafe supera la cantidad maxima de la cafetera se llenara hasta la capacidad maxima ");
            cantidadActual = cafe.getCapacidadMaxima();
            cafe.setCantidadActual(cantidadActual);
             System.out.println("La cantidad de cafe en la maquina es "+ cafe.getCantidadActual()+ " litros");
      
}else {
            System.out.println("Se llenara la cafetera con la cantidad ingresadada");
            cafe.setCantidadActual(cantidadActual);
            System.out.println("La cantidad actual de cafe en la maquina es  " + cafe.getCantidadActual());
            
            
        }
       
      }

    private Scanner newScanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  

