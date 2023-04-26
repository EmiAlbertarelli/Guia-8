/*
 Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la
cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear 
clase CafeteraServicio en el paquete Servicios con los siguiente:
1) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
2) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que 
quede. El método le informará al usuario si se llenó o no la taza, y de no haberse 
llenado en cuanto quedó la taza.
3)Método vaciarCafetera(): pone la cantidad de café actual en cero. 
4) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
*/
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera cafe = new Cafetera();
    
    public void llenarCafetera(){ 
   cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
   
    public Cafetera crearCafetera(){
      int capacidadMaxima=5000;
      int cantidadActual=2000;
      
      return  new Cafetera(capacidadMaxima, cantidadActual);
      
    }
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        
        if (cafe.getCantidadActual()>= taza) {
            cafe.setCantidadActual(cafe.getCantidadActual()- taza);
            System.out.println("****Se lleno la taza****");
            
        }else if (cafe.getCantidadActual()<taza) {
            taza=cafe.getCantidadActual();
            System.out.println("****No se lleno la taza****");
            System.out.println("La taza se lleno hasta: "+taza);
            cafe.setCantidadActual(0);       
        }
        
    }
    
    public void vaciarCafetera(){
         cafe.setCantidadActual(0);       
    }
    
    public void agregarCafe() {
        System.out.println("Cuanto cafe quiere agregar?");
        int agregar = leer.nextInt();

        if (cafe.getCantidadActual() + agregar < cafe.getCapacidadMaxima()) {

            cafe.setCantidadActual(cafe.getCantidadActual() + agregar);

            System.out.println("Se agrego la cantidad de: " + agregar);

        } else {
            System.out.println("Se sobrebepasa la cantidad maxima");

        }

        //  return llenado;
    }
}