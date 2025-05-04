import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Collections {
    /**
     * This is a simple Java program that demonstrates the use of collections.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Crea una lista de numeros enteros
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3); // Permite duplicados
        numbers.add(4);

        System.out.println("List: " + numbers);

        // Crea un mapa de cadenas a enteros
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Print the map
        System.out.println("Map: " + map);

        // Crea un conjunto de cadenas
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // No permite duplicados, se ignora
        set.add("orange");

        System.out.println("Set: " + set);

        // Colas, que son estructuras de datos FIFO (First In First Out)
        Queue<String> queue = new java.util.LinkedList<>();
        queue.add("Primera tarea");
        queue.add("Segunda tarea");
        queue.add("Tercera tarea");

        System.out.println("Queue: " + queue);
        queue.poll(); // Elimina el primer elemento
        System.out.println("Queue despues de eliminar la primera actividad: " + queue);
    }
}
