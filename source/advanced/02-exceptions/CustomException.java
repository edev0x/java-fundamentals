public class CustomException {
    /**
     * This is a custom exception class that extends RuntimeException.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception message.");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyCustomException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public MyCustomException(String message) {
        super(message);
    }
}
