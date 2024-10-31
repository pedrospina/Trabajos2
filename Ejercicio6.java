// Ejercicio 6: ¿Qué precio tenían antes del descuento?
// En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo. Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan durante el mes de septiembre.

// Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento?
public class Ejercicio6 {
    public static void main(String[] args) {
        // Definir el precio final y la tasa de descuento
        double precioFinal = 34.0; // Precio que pagaste
        double tasaDescuento = 0.15; // 15% de descuento

        // Calcular el precio original
        double precioOriginal = precioFinal / (1 - tasaDescuento);

        // Mostrar el resultado
        System.out.printf("El precio original de los pantalones era: %.2f€%n", precioOriginal);
    }
}