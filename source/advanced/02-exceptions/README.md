# Excepciones en Java

Las excepciones en Java son un mecanismo que permite manejar errores o condiciones inesperadas que ocurren durante la ejecución de un programa. Este sistema ayuda a mantener el flujo del programa y a evitar que se detenga abruptamente.

## ¿Qué es una excepción?

Una excepción es un evento que interrumpe el flujo normal de un programa. En Java, las excepciones son objetos que describen un error o una condición inusual que ocurre durante la ejecución.

## Jerarquía de Excepciones

En Java, todas las excepciones derivan de la clase base `Throwable`. Esta clase tiene dos subclases principales:

1. **Error**: Representa problemas graves que normalmente no pueden ser manejados por el programa (por ejemplo, `OutOfMemoryError`).
2. **Exception**: Representa condiciones que un programa puede manejar. Dentro de esta categoría, se encuentran:
    - **Checked Exceptions**: Excepciones que deben ser declaradas o manejadas explícitamente (por ejemplo, `IOException`). Una excepción de tipo `IOException` ocurre, por ejemplo, cuando intentamos leer un archivo que no existe o no tenemos permisos de lectura en el sistema.

    **Ejemplo:**

    ```java
    import java.io.FileReader;
    import java.io.IOException;

    public class EjemploChecked {
        public static void main(String[] args) {
            try {
                FileReader lector = new FileReader("archivo_inexistente.txt");
            } catch (IOException e) {
                System.out.println("Ocurrió un error al intentar leer el archivo: " + e.getMessage());
            }
        }
    }
    ```

    - **Unchecked Exceptions**: Excepciones que no requieren ser declaradas (por ejemplo, `NullPointerException`). Una excepción de tipo `NullPointerException` ocurre, por ejemplo, cuando intentamos acceder a un método o propiedad de un objeto que es `null`.

    **Ejemplo:**

    ```java
    public class EjemploUnchecked {
        public static void main(String[] args) {
            String texto = null;
            try {
                System.out.println(texto.length());
            } catch (NullPointerException e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }
    ```

## Manejo de Excepciones

Java proporciona un mecanismo o bloques para manejar excepciones:

### Bloque `try-catch`

```java
try {
     // Código que puede lanzar una excepción
} catch (TipoDeExcepcion e) {
     // Código para manejar la excepción
}
```

### Bloque `finally`

El bloque `finally` se ejecuta siempre, independientemente de si ocurre una excepción o no.

```java
try {
     // Código que puede lanzar una excepción
} catch (TipoDeExcepcion e) {
     // Código para manejar la excepción
} finally {
     // Código que siempre se ejecuta
}
```

### Declaración de excepciones con `throws`

Un método puede declarar que lanza una excepción utilizando la palabra clave `throws`.

```java
public void myMethod() throws IOException {
     // Código que puede lanzar IOException
}
```
Cuando un método declara que lanza una excepción utilizando `throws`, es necesario manejarla en el código que llama a dicho método. Esto se puede hacer utilizando un bloque `try-catch`.

**Ejemplo:**

```java
import java.io.IOException;

public class ExceptionsHandling {
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (IOException e) {
            System.out.println("Se manejó la excepción del método: " + e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws IOException {
        throw new IOException("Error simulado");
    }
}
```

En este ejemplo, el método `metodoQueLanzaExcepcion` declara que puede lanzar una excepción de tipo `IOException`. El método `main` maneja esta excepción utilizando un bloque `try-catch`.

## Creación de Excepciones Personalizadas

Es posible crear excepciones personalizadas extendiendo la clase `Exception` o `RuntimeException`.

```java
public class MyException extends Exception {
     public MyException(String message) {
          super(message);
     }
}

// Implementación
public class CustomExceptionHandling {
    public void doSomething() {
        ResponseObject response = service.getInfo("xyz");

        if(response == null) throw new MyException("Error al obtener respuesta del servicio");
    }
}
```

## Buenas Prácticas

- Manejar solo las excepciones que se pueden resolver.
- Evitar capturar excepciones genéricas como `Exception` o `Throwable`.
- Usar excepciones personalizadas para casos específicos.
- Siempre limpiar recursos en el bloque `finally` o usar `try-with-resources`.

## Recursos Adicionales

- [Documentación oficial de Java sobre excepciones](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
