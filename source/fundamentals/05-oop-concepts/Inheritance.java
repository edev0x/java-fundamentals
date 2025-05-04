public class Inheritance {
    /**
     * This is a simple example of inheritance in Java.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // La clase derivada puede acceder a los métodos y atributos de la clase base
        DerivedClass derived = new DerivedClass();
        derived.baseMethod(); // Llamada al método de la clase base
        derived.derivedMethod(); // Llamada al método de la clase derivada
    }
}

class BaseClass {
    // Métodos y atributos de la clase base
    public void baseMethod() {
        System.out.println("Este es un método de la clase base.");
    }
}

class DerivedClass extends BaseClass {
    // Métodos y atributos de la clase derivada

    public void derivedMethod() {
        System.out.println("Este es un método de la clase derivada o clase hija.");
    }
}