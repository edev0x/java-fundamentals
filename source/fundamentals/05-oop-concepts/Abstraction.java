public class Abstraction {

    /**
     * This is a simple example of abstraction.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase concreta
        GUIComponent button = new Button();
        GUIComponent textField = new TextField();

        // Llamar al método abstracto que es implementado por las subclases
        button.draw();
        textField.draw();
    }
}

abstract class GUIComponent {
    // Método abstracto que debe ser implementado por las subclases
    public abstract void draw();
}

class Button extends GUIComponent {
    @Override
    public void draw() {
        System.out.println("Dibujando un botón.");
    }
}

class TextField extends GUIComponent {
    @Override
    public void draw() {
        System.out.println("Dibujando un campo de texto.");
    }
}
