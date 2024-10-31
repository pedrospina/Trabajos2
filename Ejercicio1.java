
//Ejercicios
//Ejercicio 1: 6 / 2 ( 1 + 2 )
//El orden de los operadores aritméticos es muy importante ya que dependiendo del orden obtenemos un resultado u otro. En programación, el orden de los operadores es el mismo que el utilizado en matemáticas.

//En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.

//¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
//Explique por que la otra calculadora genera un resultado diferente.

public class Ejercicio1 {

    public static void main(String[] args) {
        
        var resultado = 6 / 2 * (1+2);
        var resultadoMal = 6 /(2*(1+2));

        System.out.println(resultado);
        System.out.println(resultadoMal);

    }
}





