public class Main {
    /**
     * Main method to demonstrate control flow statements in Java.
     * This program includes examples of if-else statements, for loops,
     * while loops, and switch statements.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("El número es positivo.");
        } else if (number < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // while loop
        int count = 0;
        while (count < 3) {
            System.out.println("El conteo es: " + count);
            count++;
        }

        // do-while loop
        count = 0; // Reset count for do-while loop
        do {
            System.out.println("El conteo es: " + count);
            count++;
        } while (count < 5);

        // Switch statement
        switch (number) {
            case 1:
                System.out.println("El número es uno.");
                break;
            case 10:
                System.out.println("El número es diez.");
                break;
            default:
                System.out.println("El número es desconocido.");
                break;
        }
    }
}
