# Lambdas en Java

Las expresiones lambda son una forma sencilla de representar funciones o bloques de código que se pueden pasar y ejecutar más tarde. Piensa en ellas como una manera de escribir métodos más cortos y directos, sin necesidad de crear una clase completa, son útiles para simplificar tareas comunes como ordenar listas, filtrar datos o realizar operaciones en colecciones de datos.

La sintaxis básica de una expresión lambda es:

```java
(parametros) -> { cuerpo }
```

### Ejemplo:

```java
// Expresión lambda que suma dos números
(int a, int b) -> a + b;
```

## Interfaz Funcional

Una interfaz funcional es una interfaz que contiene exactamente un método abstracto. Estas son esenciales para trabajar con lambdas. Ejemplo:

```java
@FunctionalInterface
public interface Operacion {
    int operar(int a, int b);
}
```

## Uso de Lambdas

Las lambdas se utilizan comúnmente con las API de Java, como `java.util.function` y las operaciones de streams.

### Ejemplo con Streams:

```java
import java.util.Arrays;
import java.util.List;

public class EjemploLambda {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Pedro");

        nombres.stream()
               .filter(nombre -> nombre.startsWith("J"))
               .forEach(System.out::println);
    }
}
```

## Beneficios de las Lambdas

- Código más limpio y legible.
- Facilita la programación funcional.
- Reduce la necesidad de clases anónimas.

Las expresiones lambda son una herramienta poderosa que permite escribir código más expresivo y funcional en Java. Su uso es esencial para aprovechar al máximo las características modernas del lenguaje.
