
public class ThreadStates {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 0; i <= 1000; i++) {
                System.out.println("Hi");
            }

        });

        Thread t2 = new Thread(() -> {

            for (int i = 0; i <= 1000; i++) {
                System.out.println("Hello");
            }

        });

        t1.start();
        t2.start();

    }

}
