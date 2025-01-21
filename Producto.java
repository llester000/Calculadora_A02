public class Producto {

    public double productoDosReales(double num1, double num2) {
        return num1 * num2;
    }

    public int productoDosEnteros(int num1, int num2){
        return num1 * num2;
    }
    public double productoTresReales(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }
    public double productoAcum(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}