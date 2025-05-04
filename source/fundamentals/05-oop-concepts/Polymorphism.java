public class Polymorphism {
    /**
     * This is a simple example of polymorphism.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo de polimorfismo
        Dog dog = new Dog();
        dog.makeSound(); // El perro ladra.

        Animal animal = new Animal();
        animal.makeSound(); // El animal hace un sonido.
    }
}

/**
 * Ejemplo de polimorfismo.
 * 
 * La clase Animal tiene un método makeSound que es sobrescrito por la clase
 * Dog. Cuando se llama al método makeSound en un objeto de tipo Dog, se ejecuta
 * la implementación de Dog.
 * 
 * Esto es un ejemplo de polimorfismo, donde una subclase puede proporcionar su
 * propia implementación de un método definido en la superclase mediante la
 * sobrescritura de métodos.
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