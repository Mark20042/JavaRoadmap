
interface A {

    // void run();
    int add(int a, int b);
}

public class Lambdareturn {

    public static void main(String[] args) {

        A obj = (a, b) -> {
            // System.out.println("in A run");
            return a + b;
        };
        // obj.run();
        System.out.println(obj.add(10, 20));
    }

}
