# Operadores en Java

Este documento proporciona una descripción general de los diferentes operadores en Java, los operadores son símbolos especiales que realizan operaciones en uno o más operandos y devuelven un resultado, tal cuál como lo vemos en operaciones matemáticas o lógicas en matemáticas discretas.

## Tipos de Operadores

### 1. Operadores Aritméticos
Se utilizan para realizar operaciones matemáticas básicas como suma, resta, multiplicación, división y módulo.

- **Suma (`+`)**: Suma dos valores.
- **Resta (`-`)**: Resta un valor de otro.
- **Multiplicación (`*`)**: Multiplica dos valores.
- **División (`/`)**: Divide un valor entre otro.
- **Módulo (`%`)**: Devuelve el resto de una división.

### 2. Operadores de Asignación
Se utilizan para asignar valores a las variables.

- **Asignación simple (`=`)**: Asigna un valor a una variable.
- **Asignación compuesta (`+=`, `-=`, `*=`, `/=`, `%=`)**: Combina una operación aritmética con la asignación.

### 3. Operadores Relacionales
Se utilizan para comparar dos valores y devuelven un resultado booleano (`true` o `false`).

- **Mayor que (`>`)**
- **Menor que (`<`)**
- **Mayor o igual que (`>=`)**
- **Menor o igual que (`<=`)**
- **Igual a (`==`)**
- **Distinto de (`!=`)**

### 4. Operadores Lógicos
Se utilizan para combinar expresiones booleanas.

- **AND lógico (`&&`)**: Devuelve `true` si ambas expresiones son verdaderas.
- **OR lógico (`||`)**: Devuelve `true` si al menos una expresión es verdadera.
- **NOT lógico (`!`)**: Invierte el valor de una expresión booleana.

### 5. Operadores Unarios
Operan sobre un solo operando.

- **Incremento (`++`)**: Incrementa el valor de una variable númerica en 1.
- **Decremento (`--`)**: Decrementa el valor de una variable númerica en 1.
- **Negación (`-`)**: Cambia el signo de un número.
- **Complemento lógico (`!`)**: Invierte el valor booleano.

### 6. Operadores Bit a Bit
Operan a nivel de bits.

- **AND bit a bit (`&`)**
- **OR bit a bit (`|`)**
- **XOR bit a bit (`^`)**
- **Desplazamiento a la izquierda (`<<`)**: Desplaza los bits de un número hacia la izquierda, rellenando con ceros los bits menos significativos. Este operador multiplica el número por 2 elevado al número de posiciones desplazadas.  
    **Caso de uso**: Se utiliza para realizar multiplicaciones rápidas por potencias de 2.  
    **Ejemplo**:  
    ```java
    int x = 5; // 00000101 en binario
    int resultado = x << 2; // 00010100 en binario, equivalente a 20
    ```

- **Desplazamiento a la derecha (`>>`)**: Desplaza los bits de un número hacia la derecha, conservando el signo (rellena con el bit más significativo). Este operador divide el número por 2 elevado al número de posiciones desplazadas.  
    **Caso de uso**: Se utiliza para realizar divisiones rápidas por potencias de 2 mientras se conserva el signo.  
    **Ejemplo**:  
    ```java
    int x = -20; // 11101100 en binario (en complemento a dos)
    int resultado = x >> 2; // 11111011 en binario, equivalente a -5
    ```

- **Desplazamiento sin signo a la derecha (`>>>`)**: Desplaza los bits de un número hacia la derecha, rellenando con ceros los bits más significativos. No conserva el signo.  
    **Caso de uso**: Se utiliza para divisiones rápidas por potencias de 2 en números sin signo o para manipulación de bits.  
    **Ejemplo**:  
    ```java
    int x = -20; // 11101100 en binario (en complemento a dos)
    int resultado = x >>> 2; // 00111011 en binario, equivalente a 1073741819
    ```

### 7. Operador Ternario
Es una forma abreviada de la estructura `if-else`.

- **Sintaxis**: `condición ? valor_si_verdadero : valor_si_falso`

### 8. Operadores de Concatenación
Se utilizan para concatenar cadenas de texto.

- **Concatenación (`+`)**: Une dos cadenas o una cadena con otro tipo de dato.

---

Este archivo proporciona una visión general de los operadores utilizados en el código fuente. Para más detalles, consulta el archivo `Main.java`.