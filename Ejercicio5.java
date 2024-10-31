// Ejercicio 5: ¿Cuánto te ha costado el ordenador?
// El videojuego en el ordenador está viviendo una nueva época de oro con un montón de juegos exclusivos. Para comprarte un PC Gamer deberás fijarte principalmente en el procesador, la tarjeta gráfica, la memoria RAM... pero sobre todo en los accesorios como el teclado y ratón.

// Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los accesorios incluidos. Sin embargo, el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios?
public class Ejercicio5 {
    public static void main(String[] args) {
        // Definir el precio original y la tasa de descuento
        double precioOriginal = 660.0; // Precio del PC Gamer con accesorios
        double tasaDescuento = 0.10; // 10% de descuento

        // Calcular el precio final después del descuento
        double precioFinal = precioOriginal * (1 - tasaDescuento);

        // Mostrar el resultado
        System.out.printf("El precio total a pagar por el ordenador con todos los accesorios es: %.2f€%n", precioFinal);
    }
}