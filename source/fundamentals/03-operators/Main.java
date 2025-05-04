public class Main {
    /**
     * This program demonstrates the use of various operators in Java.
     * 
     * It performs arithmetic, relational, logical, and bitwise operations and prints
     * the results to the console.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is less than b: " + (a < b));
        System.out.println("a is equal to b: " + (a == b));
        System.out.println("a is not equal to b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

        // Bitwise Operators
        int c = 6, d = 3; // 6 = 110 in binary, 3 = 011 in binary
        System.out.println("Bitwise AND: " + (c & d)); // 010 = 2
        System.out.println("Bitwise OR: " + (c | d));  // 111 = 7
        System.out.println("Bitwise XOR: " + (c ^ d)); // 101 = 5
        System.out.println("Bitwise Complement of c: " + (~c)); // -7
        System.out.println("Left Shift c by 1: " + (c << 1)); // 12
        System.out.println("Right Shift c by 1: " + (c >> 1)); // 3

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max);

        // Assignment Operators
        int e = 10;
        e += 5; // e = e + 5
        System.out.println("After += : " + e);
        e -= 3; // e = e - 3
        System.out.println("After -= : " + e);
        e *= 2; // e = e * 2
        System.out.println("After *= : " + e);
        e /= 4; // e = e / 4
        System.out.println("After /= : " + e);
        e %= 3; // e = e % 3
        System.out.println("After %= : " + e);
        // Unary Operators
        int f = 5;
        System.out.println("Pre-increment: " + (++f)); // 6
        System.out.println("Post-increment: " + (f++)); // 6
        System.out.println("After post-increment: " + f); // 7
        System.out.println("Pre-decrement: " + (--f)); // 6
        System.out.println("Post-decrement: " + (f--)); // 6
        System.out.println("After post-decrement: " + f); // 5
    }
}
