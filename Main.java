/**
 * Clase Main.
 * Esta clase prueba los metodos relacionados con las opciones de suma de la calculadora
 * <p>
 * Autor: Guillermo Olivares Bernat y su compañero
 * GitHub: llester000 y CompaneroGuillermo
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Creacion de los objetos para poder probar los metodos
         */
        Suma suma = new Suma();
        Resta resta = new Resta();
        Producto producto = new Producto();
        Cociente cociente = new Cociente();

        /**
         *Salida de los metodos de la clase suma
         */
        System.out.println("Suma de dos reales: " + suma.sumaDosReales(4.6, 2.5));
        System.out.println("Suma de dos enteros: " + suma.sumaDosEnteros(4, 2));
        System.out.println("Suma de tres reales: " + suma.sumaTresReales(4.6, 2.5, 1.5));
        System.out.println("Suma acumulativa: " + suma.sumaAcum(4));
        System.out.println("Suma acumulativa: " + suma.sumaAcum(4));
        System.out.println("---------------------------------------");

        /**
         *Salida de los metodos de la clase resta
         */

        System.out.println("Resta de dos reeales: " + resta.restaDosReales(4.6, 2.5));
        System.out.println("Resta de dos enteros: " + resta.restaDosEnteros(4, 2));
        System.out.println("Resta de tres reales: " + resta.restaTresReales(4.6, 2.5, 1.5));
        System.out.println("Resta de numero acumulado:" + resta.restaAcum(2.6));
        System.out.println("Resta de numero acumulado:" + resta.restaAcum(2.6));
        System.out.println("---------------------------------------");

        /**
         *Salida de los metodos de la clase producto
         */

        System.out.println("Producto de dos reales: " + producto.productoDosReales(1.3,4.5));
        System.out.println("Producto de dos enteros: " + producto.productoDosEnteros(2,86));
        System.out.println("Producto de tres reales: " + producto.productoTresReales(1.3,4.5,1.5));
        System.out.println("Potencia: " + producto.potencia(2,3));

        /**
         *Salida de los metodos de la clase cociente
         */

        System.out.println("---------------------------------------");
        System.out.println("Cociente de dos reales: " + cociente.cocienteDosReales(4.0, 2.0));
        System.out.println("Cociente de dos enteros: " + cociente.cocienteDosEnteros(4, 2));
        System.out.println("Inverso de 2.6: " + cociente.calcularInverso(2.6));
        System.out.println("Raiz cuadrada de 25: " + cociente.raizCuadrada(25));

    }
}