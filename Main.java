public class Main {
    public static void main(String[] args) {

        Resta resta = new Resta();
        Cociente cociente = new Cociente();

        System.out.println("Resta de dos reeales: " + resta.restaDosReales(4.6, 2.5));
        System.out.println("Resta de dos enteros: " + resta.restaDosEnteros(4, 2));
        System.out.println("Resta de tres reales: " + resta.restaTresReales(4.6, 2.5, 1.5));
        System.out.println("Resta de numero acumulado:" + resta.restaAcum(2.6));
        System.out.println("Resta de numero acumulado:" + resta.restaAcum(2.6));

        System.out.println("Cociente de dos reales: " + cociente.cocienteDosReales(4.0, 2.0));
        System.out.println("Cociente de dos enteros: " + cociente.cocienteDosEnteros(4, 2));
        System.out.println("Inverso de 2.6: " + cociente.calcularInverso(2.6));
        System.out.println("Raiz cuadrada de 25: " + cociente.raizCuadrada(25));

    }
}