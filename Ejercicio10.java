//Ejercicio 10: Media Aritmética
//Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
import java.util.Scanner;

public class Ejercicio10 {

/**
 * @param args
 */
public static void main(String[] args) {
    
     // Crear un objeto Scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);
        
     // Solicitar al usuario que introduzca tres números
     System.out.print("Introduce el primer número: ");
     double numero1 = scanner.nextDouble();
     
     System.out.print("Introduce el segundo número: ");
     double numero2 = scanner.nextDouble();
     
     System.out.print("Introduce el tercer número: ");
     double numero3 = scanner.nextDouble();
     
     // Calcular la media aritmética
     double media = (numero1 + numero2 + numero3) / 3;
     
     // Mostrar el resultado
     System.out.println("La media aritmética de los tres números es: " + media);
     
     // Cerrar el scanner
     scanner.close();
}
}

