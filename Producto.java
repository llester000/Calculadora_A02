/**
 * Clase Producto.
 * Esta clase incorpora los metodos relacionados con las opciones de producto de la calculadora
 * <p>
 * Autor: Guillermo Olivares Bernat
 * GitHub: llester000
 */
public class Producto {

    /**
     * Calcula el producto de dos números reales.
     *
     * @param num1 el primer número real
     * @param num2 el segundo número real
     * @return el resultado del producto de num1 y num2
     */
    public double productoDosReales(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Calcula el producto de dos números enteros.
     *
     * @param num1 el primer número entero
     * @param num2 el segundo número entero
     * @return el resultado del producto de num1 y num2
     */
    public int productoDosEnteros(int num1, int num2){
        return num1 * num2;
    }

    /**
     * Calcula el producto de tres números reales.
     *
     * @param num1 el primer número real
     * @param num2 el segundo número real
     * @param num3 el tercer número real
     * @return el resultado del producto de num1, num2 y num3
     */
    public double productoTresReales(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    /**
     * Calcula el producto acumulativo de un número base elevado a un exponente no negativo.
     * Este método realiza el cálculo iterativamente.
     *
     * @param base el número base que se multiplicará repetidamente
     * @param exponente el número de veces que el número base será multiplicado (debe ser un entero no negativo)
     * @return el resultado del producto acumulado del número base elevado al exponente
     */

    public double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}