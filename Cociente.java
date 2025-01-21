public class Cociente {
    public double cocienteDosReales(double num1, double num2) {
        return num1 / num2;
    }
    public double cocienteDosEnteros(int num1, int num2) {
        return num1 / num2;
    }
    public double calcularInverso(double num1) {
        if (num1 == 0) {
            return 0;
        } else {
            return 1 / num1;
        }
    }
    public double raizCuadrada(double num1) {
        return Math.sqrt(num1);
    }
}
