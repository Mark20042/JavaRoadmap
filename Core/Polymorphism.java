
class A {

    void show() {
        System.out.println("A in Show");
    }
}

class B extends A {

    void show() {
        System.out.println("B in Show");
    }
}

class C extends A {

    void show() {
        System.out.println("C in Show");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }

}
