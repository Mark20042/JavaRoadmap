
class A {

    public void show1() {
        System.out.println("in A show");
    }

}

class B extends A {

    public void show2() {
        System.out.println("in B show");
    }

}

public class UpcastDowncast {

    public static void main(String[] args) {

        // double d = 4.5;
        // int a = (int) d;
        // System.out.println(d);
        // System.out.println(a);
        A obj = new A();
        obj.show1();

        B obj2 = new B();
        obj2.show1();
        obj2.show2();

        A obj3 = (A) new B();
        obj3.show1();
        // obj3.show2(); // error

        // B obj4 = obj; // error because upcasting and downcasting cannot be done in the same line
        B obj4 = (B) obj3;
        obj4.show1();
        obj4.show2();

    }

}
