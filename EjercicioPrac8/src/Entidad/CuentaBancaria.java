/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
1)Método para crear cuenta pidiéndole los datos al usuario.
2)Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará
al saldo actual.
3)4)Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
el máximo posible hasta dejar la cuenta en 0.
5)Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
el usuario no saque más del 20%.
6)Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
7)Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Entidad;


public class CuentaBancaria {
    
    private int numeroCuenta;
    private long dniCLiente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCLiente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCLiente = dniCLiente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCLiente() {
        return dniCLiente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCLiente(long dniCLiente) {
        this.dniCLiente = dniCLiente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
