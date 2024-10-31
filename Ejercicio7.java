// Ejercicio 7: Calculadora Básica
// Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta, multiplicación y división con esos números. Muestra los resultados en la consola.
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca dos números
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Realizar las operaciones
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;

        // Comprobar si el segundo número es diferente de cero para evitar la división por cero
        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        
        // Mostrar los resultados
        System.out.printf("La suma de %.2f y %.2f es: %.2f%n", numero1, numero2, suma);
        System.out.printf("La resta de %.2f y %.2f es: %.2f%n", numero1, numero2, resta);
        System.out.printf("La multiplicación de %.2f y %.2f es: %.2f%n", numero1, numero2, multiplicacion);
        
        // Mostrar el resultado de la división solo si es válida
        if (numero2 != 0) {
            System.out.printf("La división de %.2f entre %.2f es: %.2f%n", numero1, numero2, division);
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}