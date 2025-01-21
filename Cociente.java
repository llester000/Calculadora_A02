/**
 * Clase Cociente.
 * Esta clase incorpora los metodos relacionados con las opciones de cociente de la calculadora
 * <p>
 * Autor: Compañero de Guillermo Olivares
 * GitHub: CompaneroGuillermoOlivares
 */

public class Cociente {
    /**
     * Calcula el cociente de dos números reales.
     *
     * @param num1 el dividendo como un número real
     * @param num2 el divisor como un número real
     * @return el resultado de dividir el primer número real entre el segundo
     */

    public double cocienteDosReales(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * Calcula el cociente de dos números enteros.
     *
     * @param num1 el dividendo como un número entero
     * @param num2 el divisor como un número entero
     * @return el resultado de dividir el primer número entero entre el segundo
     */
    public double cocienteDosEnteros(int num1, int num2) {
        return num1 / num2;
    }

    /**
     * Calcula el inverso de un número dado. Si el número es 0, devuelve 0.
     *
     * @param num1 el número del cual se desea calcular el inverso
     * @return el inverso del número dado, o 0 si el número es 0
     */
    public double calcularInverso(double num1) {
        if (num1 == 0) {
            return 0;
        } else {
            return 1 / num1;
        }
    }

    /**
     * Calcula la raíz cuadrada de un número dado.
     *
     * @param num1 el número del cual se desea calcular la raíz cuadrada
     * @return el resultado de la raíz cuadrada del número dado
     */
    public double raizCuadrada(double num1) {
        return Math.sqrt(num1);
    }
}
