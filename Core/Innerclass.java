
class A {

    public void show() {
        System.out.println("in A");
    }

    class B {

        public void display() {
            System.out.println("in B");
        }
    }

    static class C {

        public void cdisplay() {
            System.out.println("in C");
        }
    }

}

public class Innerclass {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        A.B objB = obj.new B();
        objB.display();

        A.C objC = new A.C();
        objC.cdisplay();

    }

}
