public class Lambdas {
    /**
     * This class demonstrates the use of lambdas.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Como puedes observar no es necesario crear una clase que implemente la
        // interfaz funcional para poder usarla. En su lugar, podemos usar una expresión
        // lambda.
        // En este caso, la interfaz funcional es `Calculator` y la expresión lambda es
        // `(a, b) -> a + b`
        // La expresión lambda toma dos argumentos `a` y `b` y devuelve su suma.
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        Calculator subtract = (a, b) -> a - b;
        Calculator divide = (a, b) -> a / b;

        System.out.println("Suma: " + add.operate(5, 3));
        System.out.println("Multiplicación: " + multiply.operate(5, 3));
        System.out.println("Resta: " + subtract.operate(5, 3));
        System.out.println("División: " + divide.operate(5, 3));

        // También podemos usar una expresión lambda más compleja que realiza una
        // operación diferente dependiendo de los valores de `a` y `b`.
        Calculator operation = (a, b) -> {
            if (a > b) {
                return a * b;
            } else {
                return (a + b) / 2;
            }
        };

        // Imprimimos el resultado de la operación
        System.out.println("Resultado de la operación final: " + operation.operate(5, 3));
    }

    interface Calculator {
        int operate(int a, int b);
    }
}
