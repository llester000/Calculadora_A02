public class Suma {
    private double valorAcumulado = 0.0;

    public double sumaDosReales(double num1, double num2) {
        return num1 + num2;
    }

    public double sumaDosEnteros(int num1, int num2) {
        return num1 + num2;
    }

    public double sumaTresReales(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public void sumaAcum(double num1) {
         valorAcumulado += num1;
    }
}
