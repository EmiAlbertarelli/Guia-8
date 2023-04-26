/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 * Método calcularIMC(): calculara si la persona está en su peso ideal
 * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor
 * menor que 20, significa que la persona está por debajo de su peso ideal y
 * la función devuelve un -1. Si la fórmula da por resultado un número entre
 * 20 y 25 (incluidos), significa que la persona está en su peso ideal y la
 * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
 * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
 * devuelve un 1.

 * @author fer_c
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean mayorDeEdad(Persona p) {
        return p.getEdad() >= 18;

    }

    public Persona crearPersona() {
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;
        String nacionalidad;

        System.out.println("Ingrese su nombre");
        nombre = leer.next();

        System.out.println("Ingrese su edad");
        edad = leer.nextInt();

        System.out.println("Ingrese el sexo");
        sexo = leer.next().charAt(0);

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("El parametro ingresado es invalido. Ingreselo de nuevo");
            sexo = leer.next().charAt(0);

        }
        
        System.out.println("Ingrese su peso en kg.");
        peso = leer.nextDouble();

        System.out.println("Ingrese su altura en mts.");
        altura = leer.nextDouble();

        System.out.println("Ingrese su nacionalidad");
        nacionalidad = leer.next();

        return new Persona(nombre, edad, sexo, peso, altura, nacionalidad);

    }
    
    public int calcularIMC(Persona pn){
        
        double imc = pn.getPeso()/ Math.pow(pn.getAltura(),2);
        if(imc < 20){
            return -1;
        }
        else if(imc >= 20 && imc <= 25 ){
            return 0;
        }
        else {
            return 1;
        }    
    }
    

}
