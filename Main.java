public class Main {
    public static void main(String[] args) {

        Resta resta = new Resta();

        System.out.println("Resta de dos reeales: " + resta.restaDosReales(4.6, 2.5));
        System.out.println("Resta de dos enteros: " + resta.restaDosEnteros(4, 2));
        System.out.println("Resta de tres reales: " + resta.restaTresReales(4.6, 2.5, 1.5));
        System.out.println("Resta de numero acumulado:" + resta.restaAcum(2.6));
        System.out.println("Resta de numero acumulado:" + resta.restaAcum(2.6));

    }
}