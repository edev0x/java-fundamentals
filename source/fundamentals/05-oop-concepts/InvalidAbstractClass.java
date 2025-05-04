abstract class AbstractClass {
    // Método abstracto que debe ser implementado por las subclases
    // En caso de no hacerlo, dará un error de compilación.
    public abstract void abstractMethod();

    // Método concreto que no necesita ser implementado por las subclases
    public void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

class ConcreteClass extends AbstractClass {
    /**
     * La clase concreta debe implementar el método abstracto de la clase abstracta.
     * abstractMethod();
     * En caso de no hacerlo, dará un error de compilación.
     */
}
