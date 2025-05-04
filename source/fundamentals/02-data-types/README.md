# Tipos de Datos en Java

En Java, los tipos de datos especifican el tipo de datos que se pueden almacenar y manipular dentro de un programa. Java es un lenguaje de tipado estático, lo que significa que cada variable debe tener un tipo de dato declarado.

## Categorías de Tipos de Datos

1. **Tipos de Datos Primitivos**: Tipos integrados proporcionados por Java.
2. **Tipos de Datos No Primitivos**: Tipos definidos por el usuario como clases, arreglos e interfaces.

---

## Tipos de Datos Primitivos

| Tipo de Dato | Tamaño (bits) | Valor Predeterminado | Descripción                                                                 |
|--------------|---------------|----------------------|-----------------------------------------------------------------------------|
| `byte`       | 8             | 0                    | Almacena números enteros de -128 a 127. Útil para ahorrar memoria en arreglos. |
| `short`      | 16            | 0                    | Almacena números enteros de -32,768 a 32,767.                               |
| `int`        | 32            | 0                    | Almacena números enteros de -2^31 a 2^31-1. Comúnmente usado para enteros.  |
| `long`       | 64            | 0L                   | Almacena números enteros de -2^63 a 2^63-1. Útil para valores enteros grandes. |
| `float`      | 32            | 0.0f                 | Almacena números fraccionarios con 6-7 dígitos decimales de precisión.      |
| `double`     | 64            | 0.0d                 | Almacena números fraccionarios con 15 dígitos decimales de precisión.       |
| `char`       | 16            | '\u0000'             | Almacena un único carácter Unicode de 16 bits.                              |
| `boolean`    | 1             | `false`              | Almacena `true` o `false`.                                                 |

---

## Tipos de Datos No Primitivos

Los tipos no primitivos incluyen:
- **Cadenas (Strings)**: Una secuencia de caracteres (por ejemplo, `"¡Hola, Mundo!"`).
- **Arreglos (Arrays)**: Una colección de elementos del mismo tipo.
- **Clases (Classes)**: Plantillas definidas por el usuario para objetos.
- **Interfaces (Interfaces)**: Tipos abstractos utilizados para especificar comportamientos.

---

## Código de Ejemplo

Ver ejemplo en [Main.java](Main.java)

Para más detalles, consulta la [documentación oficial de Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).