public class Calculadora {

    // Método para sumar dos números
    public int sumar(int a, int b) {
        // Devuelve la suma de a y b
        return a + b; // suma los números
    }

    // Método para restar dos números
    public int restar(int a, int b) {
        return a - b; // resta b de a
    }

    // Este método multiplica dos números
    public int multiplicar(int a, int b) {
        return a * b; // realiza multiplicación
    }

    // Este método divide dos números
    public int dividir(int a, int b) {
        // Verificamos si el divisor es cero
        if (b == 0) {
            // Si b es 0, lanzamos una excepción
            throw new ArithmeticException("No se puede dividir para cero");
        }
        return a / b; // división
    }

    // Fin de la clase
}