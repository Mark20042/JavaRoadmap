
@FunctionalInterface
interface A {

    void show(int i);

}

class B implements A {

    @Override
    public void show(int a) {
        System.out.println("in B show " + a);
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        A obj = new B() {
            @Override
            public void show(int a) {
                System.out.println("in A show " + a);
            }
        };

        obj.show(69);

        // lambda expression
        A obj2 = (i)
                -> {
            System.out.println("in A show lambda expression " + i);
        };
        obj2.show(67);
    }
}
