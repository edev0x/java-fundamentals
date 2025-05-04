# Guía estándar de programación en Java 
A continuación, se detalla una lista de mejores prácticas a seguir al programar en Java. Aunque esta guía esté pensada para Java, puedes hacer uso de ciertos conceptos en cualquier otro lenguaje de programación que sea fuertemente tipado o siga el paradigma de POO (Programación Orientada a Objetos).

Este documento está basado en la guía de programación estándar usada por **Google** y parte de las definiciones del equipo de **Oracle**. Existen varias guías o estándares, pero considero que estas son las mejores a seguir. 

## Un par de notas importantes 🤓☝️
Esta es una lista breve de normas que considero *las más importantes* y que he aprendido durante mi trayectoria laboral en la industria del software. 

1. **Nombres descriptivos**: Utiliza nombres claros y significativos para clases, métodos y variables.
Por ejemplo, si deseamos describir una clase que se encarga de procesar transacciones:

```java
// Mala práctica
public class Trnscts {
    public void s(); // ¿Qué significa "s()"?
}

// Buena práctica
public class Transactions {
    public void save();
    public void rollback();
}
```

2. **Consistencia en la indentación**: Aplica una indentación uniforme, preferiblemente usando espacios en lugar de tabulaciones. Comúnmente se utilizan 4 espacios de indentación.
3. **Comentarios útiles**: Escribe comentarios que expliquen el propósito del código, no lo obvio. Tu código debe ser lo suficientemente legible para que otros desarrolladores no tengan problemas al leerlo o intentar modificarlo.
4. **Evita código redundante**: Reutiliza código siempre que sea posible para evitar duplicación.
5. **Nombra tus variables y métodos siempre en INGLÉS**: Nombrar variables y métodos en inglés es una práctica común en el desarrollo de software, ya que el inglés es el idioma predominante en la industria tecnológica. Esto facilita la colaboración entre equipos internacionales y mejora la comprensión del código por parte de otros desarrolladores.

```java
// Mala práctica
public class Fecha {
    public int obtenerAñoActual() {
        // ...
    }
}

// Buena práctica
public class DateUtils {
    public int getCurrentYear() {
        // ...
    }
}
```
6. **Evita el uso de números mágicos**: Declara constantes con nombres significativos en lugar de valores literales.

```java
// Mala práctica
public class Circle {
    public double calculateArea(double radius) {
        return radius * radius * 3.14159; // ¿Qué significa 3.14159?
    }
}

// Buena práctica
public class Circle {
    private static final double PI = 3.14159; // Constante con nombre significativo

    public double calculateArea(double radius) {
        return radius * radius * PI;
    }
}
```
7. **Nombres consistentes de paquetes**: Es común durante el desarrollo de aplicaciones en java que no sepamos como nombrar los paquetes o folders que guardaran nuestras clases, pero es recomendado y adecuado el mantener los nombres de estos paquetes en minúsculas, sin acentos, ni espacios en blanco o guiones.

```java
// Mala práctica
package com.organizacion-devs.utils;
package com.organizacion_devs.utils;
package Com.OrganizacionDevs.Utils;

// Buena práctica
package com.organizacion.devs.utils;
```

Estas normas son esenciales para garantizar que el código sea comprensible, mantenible y colaborativo.

## Referencias:
> [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)

> [Oracle's Java Code Conventions](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf)