/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio3_persona;

/**
 *
 * @author Usuario
 */
import servicios.PersonaServicio;
import java.util.Scanner;
import entidades.Persona;

public class POO_ejercicio3_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();

        Persona[] arregloP = new Persona[4];
        int[] arregloIMC = new int[4];
        boolean[] arregloEdad = new boolean[4];

        int cuentaSobre = 0;
        int cuentaIdeal = 0;
        int cuentaBajo = 0;
        int cuentaMayor = 0;
        int cuentaMenor = 0;

        for (int i = 0; i < 4; i++) {

            arregloP[i] = ps.crearPersona();
            arregloIMC[i] = ps.calcularIMC(arregloP[i]);
            switch (arregloIMC[i]) {
                case 1:
                    cuentaSobre++;
                    break;

                case 0:
                    cuentaIdeal++;
                    break;

                case -1:
                    cuentaBajo++;
                    break;

            }

            arregloEdad[i] = ps.mayorDeEdad(arregloP[i]);

            if (arregloEdad[i]) {

                cuentaMayor++;

            } else {

                cuentaMenor++;

            }

        }
        System.out.println("El porsentaje de personas con sobre peso es de " + cuentaSobre * 100 / 4 + " %");
        System.out.println("El porsentaje de personas con peso ideal es de " + cuentaIdeal * 100 / 4 + " %");
        System.out.println("El porsentaje de personas con bajo peso es de " + cuentaBajo * 100 / 4 + " %");
        System.out.println("El porsentaje de personas mayor de edad es de " + cuentaMayor * 100 / 4 + " %");
        System.out.println("El porsentaje de personas menor de edad es de " + cuentaMenor * 100 / 4 + " %");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println(arregloP[i].toString());
        }
    }

}
