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
package ejercicioprac2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;



public class Main2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CafeteraServicio miCafetera = new CafeteraServicio();
        Cafetera cf = miCafetera.crearCafetera();
        String opcion = "si";
        
    do{
        System.out.println("Elige que opcion desea");
        System.out.println("1- Llenar cafetera\n"
                + "2- Servir Taza\n"
                + "3- Vaciar Cafetera\n"
                + "4- Agregar Cafetera");
    
        int op = leer.nextInt();
        
        switch(op){
            case 1: 
                miCafetera.llenarCafetera();
                break;
            case 2:
                miCafetera.servirTaza();
                break;
            case 3:
                miCafetera.vaciarCafetera();
                break;
            case 4:
                miCafetera.agregarCafe();
        }
        System.out.println("Desea seguir utilizando la cafetera");
        opcion = leer.next();
    }
    while(opcion.equalsIgnoreCase("si"));
    }
    
    
   
}
