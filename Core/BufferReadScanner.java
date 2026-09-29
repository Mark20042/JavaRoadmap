
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReadScanner {

    public static void main(String[] args) throws IOException {

        // System.out.println("Enter the value : ");
        // int i = System.in.read(); // ascii value
        // System.out.println(i - 48); // to get the value we subtract 48 but one character at a time
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        int j = 0;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the value : ");
            j = sc.nextInt();
            System.out.println(j);

        } catch (Exception e) {
            System.out.println("Something went wrong " + e.toString());
        } finally {
            System.out.println("Bye " + j);
        }

    }
}
