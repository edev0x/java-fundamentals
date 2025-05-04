# Variables en Java

En Java, una variable es un contenedor que se utiliza para almacenar datos. Cada variable tiene un tipo de dato específico que define qué tipo de valores puede almacenar, como números enteros, decimales, textos (representados por caracteres) o valores booleanos (verdadero o falso).

## Declaración de Variables
Para declarar una variable en Java, se debe especificar el tipo de dato seguido del nombre de la variable. Por ejemplo:
```java
int numero; // Declaración de una variable de tipo entero
```

## Inicialización de Variables
Una vez declarada, se puede asignar un valor a la variable:
```java
numero = 10; // Asignación de valor
```
También es posible declarar e inicializar una variable en una sola línea:
```java
int numero = 10;
```

## Tipos de Datos Comunes
- `int`: Números enteros (ejemplo: 1, 2, 3).
- `double`: Números decimales (ejemplo: 3.14).
- `char`: Un solo carácter (ejemplo: 'A').
- `boolean`: Valores lógicos (`true` o `false`).

## Reglas para Nombres de Variables
1. Deben comenzar con una letra, o los símbolos `$` o `_`.
2. No pueden contener espacios ni caracteres especiales.
   
   ```java
    int ed ad; // Mala práctica y declaración, genera un error en el editor.

    String %Aaplicar; // Mala práctica y declaración, genera un error en el editor. 
   ```

3. No pueden ser palabras reservadas de Java. Para saber cuales son las palabras reservadas de java puedes ver el siguiente enlace: [Palabras reservadas de Java [Oracle]](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

Este ejemplo muestra cómo declarar, inicializar y usar variables en un programa Java.