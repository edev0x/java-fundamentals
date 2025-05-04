import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    /**
     * This class demonstrates the use of streams.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Hacemos uso de operaciones intermedias como `filter` con la API de Streams
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList()); // Recopilamos los resultados en una lista

        // Imprimimos los números pares
        System.out.println("Numeros pares: " + evenNumbers);

        // Hacemos uso de operaciones terminales como `forEach` con la API de Streams
        Stream<String> stringStream = Stream.of("apple", "banana", "cherry");

        // Imprimimos los elementos en mayúsculas
        stringStream.map(String::toUpperCase)
                .forEach(System.out::println);

        // Sumamos todos los números de la lista
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Usamos reduce para sumar los números
        System.out.println("Total al sumar todos los números: " + sum);
    }
}
