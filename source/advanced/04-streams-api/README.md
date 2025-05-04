# API de Streams en Java

La API de Streams en Java, introducida en Java 8, es una poderosa herramienta para procesar colecciones de datos de manera funcional y declarativa. Permite realizar operaciones como filtrado, mapeo, reducciones y más, de una manera eficiente y concisa.

## ¿Qué es un Stream?

Un Stream es una secuencia de elementos que se pueden procesar de manera funcional, es decir, a través de funciones flecha o anónimas, las cuales pueden ser almacenadas en variables, ser pasadas como argumentos y retornar otro tipo de funciones. 

Un `Stream` no almacena datos, sino que opera sobre una fuente de datos como colecciones, arreglos o generadores.

## Características principales

- **Inmutabilidad**: Los Streams no modifican la fuente de datos original.
- **Evaluación lazy**: Las operaciones intermedias no se ejecutan hasta que se invoca una operación terminal. Es bastante útil para evitar un alto consumo de recursos.
- **Encadenamiento**: Las operaciones se pueden encadenar para crear pipelines de procesamiento.

## Operaciones en Streams

### Operaciones intermedias
Estas transforman un Stream en otro Stream. Ejemplos:
- `filter(Predicate<T>)`: Filtra elementos según una condición.
- `map(Function<T, R>)`: Transforma cada elemento.
- `sorted()`: Ordena los elementos.

### Operaciones terminales
Estas producen un resultado o efecto secundario. Ejemplos:
- `forEach(Consumer<T>)`: Itera sobre cada elemento.
- `collect(Collector)`: Recoge los elementos en una colección.
- `reduce(BinaryOperator<T>)`: Reduce los elementos a un único valor.

## Ejemplo básico

```java
import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Pedro", "Luis");

        nombres.stream()
            .filter(nombre -> nombre.startsWith("P"))
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
```

## Beneficios de usar Streams

- Código más limpio y legible.
- Mejor rendimiento gracias a la evaluación lazy.
- Facilita el procesamiento paralelo.

## Recursos adicionales

- [Documentación oficial de Java](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
- [Guía de Streams en Baeldung](https://www.baeldung.com/java-8-streams)