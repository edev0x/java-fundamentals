# Marco de Colecciones de Java

El Marco de Colecciones de Java proporciona un conjunto de **clases** e **interfaces** para almacenar y manipular grupos de objetos de manera eficiente. Es parte del paquete `java.util` e incluye estructuras de datos como listas, conjuntos, colas y mapas.

## Interfaces importantes 💡

### 1. **List**
- Una colección ordenada que permite elementos duplicados.
- Implementaciones comunes:
    - `ArrayList`
    - `LinkedList`
- Ejemplo:
    ```java
    List<String> list = new ArrayList<>();
    list.add("Manzana");
    list.add("Banana");
    ```

### 2. **Set**
- Una colección que no permite elementos duplicados.
- Implementaciones comunes:
    - `HashSet`
    - `LinkedHashSet`
    - `TreeSet`
- Ejemplo:
    ```java
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    ```

### 3. **Queue**
- Una colección diseñada para contener elementos antes de procesarlos.
- Implementaciones comunes:
    - `PriorityQueue`
    - `LinkedList` (como una cola)
- Ejemplo:
    ```java
    Queue<String> queue = new LinkedList<>();
    queue.add("Tarea1");
    queue.add("Tarea2");
    ```

### 4. **Map**
- Una colección de pares clave-valor.
- Implementaciones comunes:
    - `HashMap`
    - `LinkedHashMap`
    - `TreeMap`
- Ejemplo:
    ```java
    Map<String, Integer> map = new HashMap<>();
    map.put("Alicia", 25);
    map.put("Bob", 30);
    ```

## Ventajas de Usar Colecciones
- Reduce el esfuerzo de programación al proporcionar estructuras de datos reutilizables.
- Mejora el rendimiento con algoritmos optimizados.
- Proporciona variantes seguras para hilos como `Collections.synchronizedList`.

## Métodos de Utilidad Comunes
La clase `Collections` proporciona métodos de utilidad para trabajar con colecciones:
- `Collections.sort(list)`
- `Collections.reverse(list)`
- `Collections.shuffle(list)`

## Recursos
- [Documentación del Marco de Colecciones de Java](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
- [Tutoriales de Oracle Java](https://docs.oracle.com/javase/tutorial/collections/)