// Ejercicio 2: ¿Ves algún error en el precio?
// En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el precio?

// En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
public class Ejercicio2 {
    public static void main(String[] args) {
        // Definir el precio por 100 gramos y el precio que dice el vendedor por kilo
        double precioPor100Gramos = 5.95; // Precio por 100 gramos
        double precioVendedorPorKilo = 29.75; // Precio que dice el vendedor por kilo

        // Calcular el precio por kilo
        double precioPorKiloCalculado = precioPor100Gramos * 10;

        // Mostrar los resultados
        System.out.printf("Precio calculado por kilo: %.2f€%n", precioPorKiloCalculado);
        System.out.printf("Precio que dice el vendedor por kilo: %.2f€%n", precioVendedorPorKilo);

        // Comparar los precios
        if (precioPorKiloCalculado == precioVendedorPorKilo) {
            System.out.println("El precio por kilo es correcto.");
        } else {
            System.out.println("El precio por kilo no es correcto.");
        }
    }
}