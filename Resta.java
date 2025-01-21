/**
 * Clase Resta.
 * Esta clase incorpora los metodos relacionados con las opciones de resta de la calculadora
 * <p>
 * Autor: Compañero de Guillermo Olivares
 * GitHub: CompaneroGuillermoOlivares
 */
public class Resta {

    // Variable para el valor acumulado.
    private double valorAcumulado = 10.0;

    /**
     * Resta dos números reales dados y devuelve el resultado.
     *
     * @param num1 el primer número real
     * @param num2 el segundo número real
     * @return el resultado de restar el segundo número real del primero
     */

    public double restaDosReales(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Resta dos números enteros dados y devuelve el resultado.
     *
     * @param num1 el primer número entero
     * @param num2 el segundo número entero
     * @return el resultado de restar el segundo número entero del primero
     */

    public double restaDosEnteros(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Resta tres números reales dados y devuelve el resultado.
     *
     * @param num1 el primer número real
     * @param num2 el segundo número real
     * @param num3 el tercer número real
     * @return el resultado de restar el segundo y el tercer número real del primero
     */

    public double restaTresReales(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    /**
     * Resta un número al valor acumulado en la clase.
     *
     * @param num1 el número a restar del valor acumulado
     */
    public double restaAcum(double num1) {
         return valorAcumulado -= num1;
    }

}
