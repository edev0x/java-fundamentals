import javax.swing.JOptionPane;

public class SwingGUI {
    /**
     * This is a simple Swing GUI program that displays a message dialog.
     * 
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Muestra un cuadro de diálogo con un mensaje de saludo
        JOptionPane.showMessageDialog(null, "Hola, desde SWING UI!",
                "Saludo", JOptionPane.INFORMATION_MESSAGE);

        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");

        if (nombre != null && !nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hola, " + nombre + "!",
                    "Saludo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se proporcionó un nombre.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Muestra un cuadro con un mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Este es un mensaje de advertencia.",
                "Advertencia", JOptionPane.WARNING_MESSAGE);

        // Muestra un cuadro de diálogo de error
        JOptionPane.showMessageDialog(null, "Este es un mensaje de error.",
                "Error", JOptionPane.ERROR_MESSAGE);

        // Muestra un cuadro de diálogo de confirmación
        int respuesta = JOptionPane.showConfirmDialog(null,
                "¿Quieres continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Continuando...",
                    "Continuar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.",
                    "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0); // Cierra la aplicación después de cerrar el cuadro de diálogo
    }
}
