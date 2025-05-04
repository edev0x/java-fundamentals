public class Main {
    public static void main(String[] args) {
        // Ejemplo de encapsulación
        Wallet savingsWallet = new Wallet(1000.0);
        savingsWallet.deposit(200.0);

        // Retiro de dinero de la billetera
        savingsWallet.withdraw(50.0);
        System.out.println("Saldo de la billetera de ahorros: $" + savingsWallet.getBalance());
        // Retirar un monto mayor al saldo disponible
        savingsWallet.withdraw(1200.0);
        // Retirar un monto negativo, el cual no es válido
        savingsWallet.withdraw(-50.0);
        // Retirar un monto de 0.0, el cual no es válido
        savingsWallet.withdraw(0.0);

        // Ejemplo de herencia
        Student student = new Student("Juan", "20", "S12345");
        System.out.println("Nombre del estudiante: " + student.getName() + ", Edad: " + student.getAge() + ", ID: "
                + student.getStudentId());

        // Ejemplo de polimorfismo
        Dog dog = new Dog();
        dog.makeSound(); // El perro ladra.

        Animal animal = new Animal();
        animal.makeSound(); // El animal hace un sonido.
    }
}

/**
 * Esta clase representa una billetera simple que puede contener un saldo.
 * Permite depositar y retirar dinero.
 * 
 * Demuestra el uso de encapsulación y principios básicos de POO.
 * 
 * @version 1.0
 */
class Wallet {
    private double balance;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Se ha acreditado un monto de: $" + amount + " a la billetera.");
        } else {
            System.out.println("Monto inválido");
        }
    }

    /**
     * Retira un monto de la billetera.
     * 
     * @param amount El monto a retirar
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Se ha debitado un monto de $" + amount + " de la billetera.");
        } else {
            System.out.println("Monto inválido o saldo insuficiente");
        }
    }

    public double getBalance() {
        return balance;
    }
}

/**
 * Esta clase demuestra el uso de herencia y encapsulación.
 */
class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}

/*
 * Esta clase representa un estudiante, que es una subclase de Persona.
 */
class Student extends Person {
    private String studentId;

    public Student(String name, String age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}

/**
 * Esta clase demuestra el uso de polimorfismo.
 */
class Animal {
    public void makeSound() {
        System.out.println("El animal hace un sonido.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("El perro ladra.");
    }
}

/**
 * Esta clase demuestra el uso de clases y métodos abstractos.
 */
abstract class GUIComponent {
    public abstract void draw();
}

/**
 * Esta clase representa un botón, que es una subclase de GUIComponent.
 * Implementa el método draw para proporcionar un comportamiento específico para dibujar un botón.
 */
class Button extends GUIComponent {
    @Override
    public void draw() {
        System.out.println("Dibujando un botón.");
    }
}