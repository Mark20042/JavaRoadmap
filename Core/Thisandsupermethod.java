
class A {

    public A() {
        super();
        System.out.println("Constructor of A");
    }

    public A(int a) {
        super();
        System.out.println("Parameterized Constructor of A parameter = " + a);
    }

    public void running() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class B extends A {

    public B() {
        super(69);
        System.out.println("Constructor of B");
    }

    public B(int a) {
        // super(a);
        this();
        System.out.println("Parameterized Constructor of B parameter = " + a);
    }
}

public class Thisandsupermethod {

    public static void main(String[] args) {
        B b1 = new B(5);
    }
}
