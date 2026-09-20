package Core;

public class Literal {

    public static void main(String a[]) {
    int num1 = 0b1011; // Integer literal
    int num2 = 0xE7; // Hexadecimal literal
    long num3 = 100_000_000_000L; // Underscores in numeric literals

    System.out.println(num1); // Output: 11
    System.out.println(num2); // Output: 10
    System.out.println(num3); // Output: 10000000000
    }
}
