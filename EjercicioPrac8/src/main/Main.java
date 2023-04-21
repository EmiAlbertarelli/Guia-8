/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
1)Método para crear cuenta pidiéndole los datos al usuario.
2)Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará
al saldo actual.
3)Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
el máximo posible hasta dejar la cuenta en 0.
5)Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
el usuario no saque más del 20%.
5)Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
6)Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package main;

import Entidad.CuentaBancaria;
import java.util.Scanner;
import servicio.CuentaBancariaServicio;


public class Main {
    
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta = servicio.crearCuenta();
        
        servicio.ingresar(cuenta, 0);
        
        servicio.retirar(cuenta, 0);
        
        servicio.extraccionRapida(cuenta);
        
        servicio.consultarSaldo(cuenta);
        
        servicio.consultarDatos(cuenta);
        
                
    }
}