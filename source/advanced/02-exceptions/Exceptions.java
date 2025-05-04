public class Exceptions {
    /**
     * This is a simple Java program that demonstrates exception handling.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Esto generará una ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Excepción por operación aritmética: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre, independientemente de si hubo una excepción o no.");
        }
    }
}
