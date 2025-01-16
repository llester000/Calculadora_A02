/**
 * Clase Suma.
 * Esta clase incorpora los metodos relacionados con las opciones de suma de la calculadora
 * <p>
 * Autor: Guillermo Olivares Bernat
 * GitHub: llester000
 */
public class Suma {

    // Variable para el valor acumulado.
    private double valorAcumulado = 0.0;

    /**
     * Suma de dos numeros reales
     * @param num1 El primer numero real
     * @param num2 El segundo numero real
     * @return Devuelve el resultado Real de la suma del numero 1 y 2
     */
    public double sumaDosReales(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Suma de dos numeros enteros
     * @param num1 El primer numero entero
     * @param num2 El segundo numero entero
     * @return Devuelve el resultado entero de la suma del numero 1 y 2
     */

    public int sumaDosEnteros(int num1, int num2) {
        return num1 + num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public double sumaTresReales(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public void sumaAcum(double num1) {
        valorAcumulado += num1;
    }
}
