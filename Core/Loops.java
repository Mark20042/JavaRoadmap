package Core;

public class Loops {
    public static void main(String a[]) {
        // For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(" * " );
        }

        // While loop
        System.out.println("While Loop:");
        int rows = 5, i = 1;
        while (i <= rows) {
           int j = 1;
            while (j <= i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println("\n");
            i++;

        }
        

        // Do-while loop
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
