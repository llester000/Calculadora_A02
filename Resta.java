public class Resta {

    private double valorAcumulado = 0.0;

    public double restaDosReales(double num1, double num2) {
        return num1 - num2;
    }

    public double restaDosEnteros(int num1, int num2) {
        return num1 - num2;
    }

    public double restaTresReales(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    public void restaAcum(double num1) {
         valorAcumulado -= num1;
    }

}
