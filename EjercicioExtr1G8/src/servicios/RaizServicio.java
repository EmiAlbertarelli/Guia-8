/* Vamos a realizar una clase llamada Raices, donde representaremos los valores de
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto
a través de un método constructor. Luego, en RaicesServicio las operaciones que 
se podrán realizar son las siguientes:
a)Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b)Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
c)Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
d)Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las
2 posibles soluciones.
e)Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
raíz. Es en el caso en que se tenga una única solución posible.
f)Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros 
métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el 
signo delante de -b */
package servicios;

import entidades.Raiz;
import java.util.Scanner;


public class RaizServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raiz rz = new Raiz();

    public Raiz crearRaiz() {
        System.out.println("Ingrese los coeficientes a, b y c");
        rz.setA(leer.nextDouble());
        rz.setB(leer.nextDouble());
        rz.setC(leer.nextDouble());
        return rz;
    }

    public double getDiscriminate(Raiz raiz) {
        double aux = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
        return aux;//(b^2)-(4*a*c)
    }

    public boolean tieneRaices(Raiz raiz) {
        return (getDiscriminate(raiz) > 0);
    }

    public boolean tieneRaiz(Raiz raiz) {
        return (getDiscriminate(raiz) == 0);
    }

    public void calcular(Raiz raiz) {

        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No existe solución real");
        }

    }

    public void obtenerRaiz(Raiz raiz) {
        System.out.print("La raiz es: ");
        System.out.println(-(raiz.getB()) / (2 * raiz.getA()));
        //-b/(2*a)
    }

    public void obtenerRaices(Raiz raiz) {
        //(-b±√((b^2)-(4*a*c)))/(2*a) = (-b±√(discriminante))/(2*a)
        System.out.print("Las raices son: ");
        System.out.print((-(raiz.getB()) + Math.sqrt(getDiscriminate(raiz))) / (2 * raiz.getA()));
        //(-b+√(discriminante))/(2*a)
        System.out.print(" y ");
        System.out.println((-(raiz.getB()) - Math.sqrt(getDiscriminate(raiz))) / (2 * raiz.getA()));
        //(-b-√(discriminante))/(2*a) 
    }

}


