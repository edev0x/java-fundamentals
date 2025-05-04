public class Main {
    /**
     * This program demonstrates the declaration and initialization of various types
     * of variables.
     * 
     * It prints the values of these variables to the console.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Variables declaration
        String bookTitle = "The Great Gatsby";
        int bookPages = 180;
        double bookPrice = 10.99;
        boolean isAvailable = true;
        char bookRating = 'A';
        byte bookRatingByte = 5; // Rating from 1 to 5
        short bookRatingShort = 4; // Rating from 1 to 10
        long bookISBN = 9780743273565L; // ISBN number

        // Print variable values
        String bookInfo = "Título del Libro: " + bookTitle + "\n" +
                "Número de Páginas: " + bookPages + "\n" +
                "Precio: $" + bookPrice + "\n" +
                "Disponible: " + isAvailable + "\n" +
                "Calificación: " + bookRating + "\n" +
                "Calificación (byte): " + bookRatingByte + "\n" +
                "Calificación (short): " + bookRatingShort + "\n" +
                "ISBN: " + bookISBN;

        System.out.println(bookInfo);
    }
}
