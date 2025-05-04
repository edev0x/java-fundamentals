# Flujo de Control en Java
El flujo de control en Java se refiere a la forma en que se ejecutan las instrucciones en un programa. 

Java nos proporciona varias estructuras de control que nos permiten tomar decisiones, repetir bloques de código y controlar el flujo de ejecución.

## Estructuras de Control

### 1. **Condicionales**
Las estructuras condicionales permiten ejecutar diferentes bloques de código dependiendo de una condición.

- **`if`**
    ```java
    if (condicion) {
            // Código a ejecutar si la condición es verdadera
    }
    ```

- **`if-else`**
    ```java
    if (condicion) {
            // Código a ejecutar si la condición es verdadera
    } else {
            // Código a ejecutar si la condición es falsa
    }
    ```

- **`else if`**
    ```java
    if (condicion1) {
            // Código a ejecutar si la condición1 es verdadera
    } else if (condicion2) {
            // Código a ejecutar si la condición2 es verdadera
    } else {
            // Código a ejecutar si ninguna condición es verdadera
    }
    ```

- **`switch`**

Restricciones de la instrucción `switch`:
 
- La expresión evaluada debe ser de un tipo compatible (generalmente `int`, `char`, `enum` o `String` en algunos lenguajes).
- Cada caso debe ser único y no puede repetirse.
- Es importante incluir un caso `default` para manejar valores no previstos.
- Los bloques de código dentro de cada caso deben terminar con una instrucción `break` (o equivalente) para evitar la ejecución de casos posteriores.  Este enfoque es útil para simplificar la lógica condicional cuando hay múltiples valores posibles para una variable.
    
    ```java
    switch (variable) {
            case valor1:
                    // Código para el caso valor1
                    break;
            case valor2:
                    // Código para el caso valor2
                    break;
            default:
                    // Código si no coincide ningún caso
    }
    ```

### 2. **Bucles**
Los bucles permiten repetir un bloque de código mientras se cumpla una condición.

- **`for`**
    ```java
    for (inicializacion; condicion; actualizacion) {
            // Código a ejecutar en cada iteración
    }
    ```

- **`while`**
    ```java
    while (condicion) {
            // Código a ejecutar mientras la condición sea verdadera
    }
    ```

- **`do-while`**
    ```java
    do {
            // Código a ejecutar al menos una vez
    } while (condicion);
    ```

### 3. **Control de Bucles**
Java proporciona palabras clave para controlar la ejecución de los bucles.

- **`break`**: Termina el bucle inmediatamente.
    ```java
    for (int i = 0; i < 10; i++) {
            if (i == 5) {
                    break;
            }
    }
    ```

- **`continue`**: Salta a la siguiente iteración del bucle.
    ```java
    for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                    continue;
            }
    }
    ```

Las estructuras control son fundamentales para escribir programas dinámicos y flexibles. Comprender cómo usar condicionales, bucles y control de bucles te permitirá resolver problemas de una forma más eficiente.
