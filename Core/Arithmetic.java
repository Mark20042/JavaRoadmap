package Core;

public class Arithmetic {
    public static void main(String a[]) {
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum); // Output: 15

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference); // Output: 5

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product); // Output: 50

        // Division
        int quotient = num1 / num2;
        System.out.println("Quotient: " + quotient); // Output: 2

        // Modulus
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder); // Output: 0


        // Increment
        int num = 5;
        int newNum = 5; // Post-increment

        int result = num++; // Post-increment
        int result2 = ++newNum; // Pre-increment
        System.out.println("Result after post-increment: " + result); // Output: 5
        System.out.println("Result after pre-increment: " + result2); // Output: 6
    }
}
