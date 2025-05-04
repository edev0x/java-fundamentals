# Conceptos de OOP
## Programación Orientada a Objetos

La Programación Orientada a Objetos (OOP) es un paradigma de programación que organiza el código en torno a objetos y clases. En Java, OOP es un enfoque central que permite crear aplicaciones modulares, reutilizables y fáciles de mantener. A continuación, se describen los conceptos fundamentales de OOP:

## 1. **Clases y Objetos**
- **Clase**: Es una plantilla o modelo que define las propiedades (atributos) y comportamientos (métodos) de un objeto.
- **Objeto**: Es una instancia de una clase. Representa una entidad del mundo real con estado y comportamiento.

```java
// Clase que define a una Persona y sus diferentes atributos
class Person {
    String name; // name es un atributo de una persona
    int age; // edad es un atributo de una persona

    // El método greet() es el comportamiento de "saludar" el cuál realiza una persona
    void greet() {
        System.out.println("Hola, mi nombre es " + name);
    }
}
```

Para hacer uso de la clase Persona con sus propiedades y métodos, debemos crear una "instancia" de dicha clase, es decir, un objeto en memoria, para poder interactuar con ella.

Mediante la instrucción `Person person = new Person();`, estamos creando un objeto (una instancia) llamada "person" del tipo "Person", cabe destacar que el nombre de la clase siempre se diferencia por la primera letra mayúscula en su nombre, mientras que el objeto siempre se nombra en minúscula.

```java
Person person = new Person();
person.name = "John"; // Accedemos a la propiedad `name` y asignamos el valor "John"
person.greet(); // Invocamos el método `greet()` el cual imprime un mensaje
```

## 2. **Encapsulamiento**
El encapsulamiento consiste en restringir el acceso directo a los atributos de una clase y proporcionar métodos para acceder y modificar esos atributos. Esto se logra utilizando modificadores de acceso como `private`, `public` y `protected`.

```java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

## 3. **Herencia**
La herencia permite que una clase (subclase) herede atributos y métodos de otra clase (superclase). Esto promueve la reutilización del código.

En este ejemplo, la clase `Dog` hereda de la clase `Animal`. Esto significa que `Dog` puede usar los métodos definidos en `Animal`, como `eat()`, sin necesidad de volver a implementarlos (escribirlos en la clase `Dog`). 

Además, `Dog` puede definir sus propios métodos, como `bark()`. Esto demuestra cómo la herencia permite extender el comportamiento de una clase base mientras se agrega funcionalidad específica en cada subclase.

### Código de ejemplo:

```java
class Animal {
    void eat() {
        System.out.println("Un animal puede comer.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Solo los perros pueden ladrar.");
    }
}

Dog dog = new Dog();
dog.eat(); // Llama al método heredado de la clase Animal
dog.bark(); // Llama al método definido en la clase Dog
```

### Explicación del caso de uso:
1. **Reutilización de código**: La clase `Dog` no necesita implementar el método `eat()` porque ya lo hereda de la clase `Animal`. Esto reduce la duplicación de código.
2. **Extensibilidad**: La clase `Dog` puede agregar nuevos métodos, como `bark()`, que son específicos de los perros, sin afectar la clase base `Animal`.
3. **Jerarquía lógica**: La relación entre `Animal` y `Dog` refleja una jerarquía del mundo real, donde un perro es un tipo de animal. Esto hace que el diseño del código sea más intuitivo y fácil de entender.

## 4. **Polimorfismo**
El polimorfismo permite que un objeto tome múltiples formas. En Java, esto se logra mediante la sobrecarga de métodos y la sobrescritura de métodos.

- **Sobrecarga de métodos**: Mismo nombre de método, diferentes parámetros.
- **Sobrescritura de métodos**: Una subclase redefine un método de la superclase.

```java
/**
 * Ejemplo de sobrecarga de métodos [Overloading]
**/
class Operation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

/**
 * 
 * Ejemplo de sobreescritura de metodos [Overriding]
 * 
**/
class Animal {
    void makeSound() {
        System.out.println("Sonido generico de animal.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
```

## 5. **Abstracción**
La abstracción consiste en ocultar los detalles de implementación y mostrar solo la funcionalidad esencial. En Java, se logra mediante clases abstractas e interfaces.

- **Clase abstracta**: Puede tener métodos abstractos (sin implementación, es decir, lógica sobre que debería hacer el método) y métodos concretos.
- **Interfaz**: Define un contrato que las clases deben cumplir.

Al extender de clases abstractas o implementar interfaces, la clase hija debe implementar todos los métodos abstractos definidos en la clase base, a menos que también sea declarada como abstracta.

```java
abstract class Vehicle {
    abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("El motor del coche está encendido.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("El motor de la motocicleta está encendido.");
    }
}

// Uso de las clases abstractas
Vehicle car = new Car();
car.startEngine(); // Salida: El motor del coche está encendido.

Vehicle motorcycle = new Motorcycle();
motorcycle.startEngine(); // Salida: El motor de la motocicleta está encendido.
```

Los conceptos de OOP en Java son fundamentales para escribir código limpio, modular y reutilizable. El comprender y aplicar estos principios te permitirá desarrollar aplicaciones más robustas y fáciles de mantener.

